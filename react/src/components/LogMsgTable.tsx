import React, {FunctionComponent} from "react";
import {LogMsgProps} from "../types/types";
import MaterialTable from "material-table";

const columns = [
    {
        title: "Object ID",
        field: "objId",
    },
    {
        title: "Content",

        field: "content",
    },
    {
        title: "Is transformed",
        field: "transformed",
    }
];

const LogMsgTable: FunctionComponent<LogMsgProps> = ({logs}) => {
    return (
        <div>
            <MaterialTable columns={columns} data={logs}/>
        </div>
    )
}

export default LogMsgTable;
