import React, { useEffect, useState } from 'react';
import { ITransformedLogs } from "types/index";
import axios from "axios";
import {LogMsgTable, LogMsgTableCustom} from "components/LogMsgTable/index";

function App() {

    const [t_logs, setLogs] = useState<ITransformedLogs[]>([])

    useEffect(() => {
        // fetchLogs()
        setLogs(createLogs)
    }, [])

    async function fetchLogs() {
        await axios.get<ITransformedLogs[]>
        ('http://localhost:8080/api/logs')
            .then(response => setLogs(response.data))
            .catch(e => console.log(e))
    }

    const createLogs = () : ITransformedLogs[] => {
      return [
          {objId: '1', content: "ads", transformed: true},
          {objId: '1', content: "ads", transformed: true},
          {objId: '1', content: "ads", transformed: true},
          {objId: '1', content: "ads", transformed: true},
          {objId: '1', content: "ads", transformed: true}
      ]
    }

    return (
        <div>
            <LogMsgTable logs={t_logs} total={10}/>
            <LogMsgTableCustom logs={t_logs} total={10}/>
        </div>
    )
}

export default App;
