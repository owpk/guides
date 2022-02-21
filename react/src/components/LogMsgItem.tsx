import React, {FC} from 'react';
import {ITransformedLogs} from "../types/types";

interface ILogMsgItemProps {
    log: ITransformedLogs
}

const LogMsgItem : FC<ILogMsgItemProps> =
    ({log}) => {
    return (
        <div style={{padding: 15, border: '1px solid gray'}}>
            {log.objId}. {log.content} --- {log.transformed ? 'Y' : 'N'}
        </div>
    )
}

export default LogMsgItem;
