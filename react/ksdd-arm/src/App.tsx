import React, {useEffect, useState} from 'react';
import {ITransformedLogs} from "./types/types";
import axios from "axios";
import LogMsgTable from "./components/LogMsgTable";

function App() {

    const [t_logs, setLogs] = useState<ITransformedLogs[]>([])

    useEffect(() => {
        fetchLogs()
    }, [])

    async function fetchLogs() {
        await axios.get<ITransformedLogs[]>
        ('http://localhost:8080/api/logs')
            .then(response => setLogs(response.data))
            .catch(e => console.log(e))
    }


    return (
        <div>
            <LogMsgTable logs={t_logs}/>
        </div>
    )
}

export default App;
