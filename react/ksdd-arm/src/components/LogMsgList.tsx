import React, {FC} from 'react';
import {LogMsgProps} from "../types/types";
import LogMsgItem from "./LogMsgItem";

const LogMsgList: FC<LogMsgProps> = ({logs}) => {
    return (
        <div style={{padding: 15, border: '1px solid gray'}}>
            {logs.map(l =>
                <LogMsgItem key={l.objId} log={l}/>
            )}
        </div>
    )
}

export default LogMsgList;
