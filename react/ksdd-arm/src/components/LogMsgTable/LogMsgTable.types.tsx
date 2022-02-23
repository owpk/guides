import React, {FC} from 'react';
import {ITransformedLogs, LogMsgProps} from "types/index";

interface ILogMsgItemProps {
    log: ITransformedLogs
}

const LogMsgItem: FC<ILogMsgItemProps> =
    ({log}) => {
    return (
        <div style={{padding: 15, border: '1px solid gray'}}>
            {log.objId}. {log.content} --- {log.transformed ? 'Y' : 'N'}
        </div>
    )
}

export const LogMsgList: FC<LogMsgProps> = ({logs}) => {
   return (
       <div style={{padding: 15, border: '1px solid gray'}}>
           {logs.map(l =>
               <LogMsgItem key={l.objId} log={l}/>
           )}
       </div>
   )
}
