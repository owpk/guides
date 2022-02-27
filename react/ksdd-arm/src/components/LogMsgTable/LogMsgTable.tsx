import React, { FC } from "react";
import { LogMsgProps } from "types/index";
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

export const LogMsgTable: FC<LogMsgProps> = ({ logs, total }) => {
  return (
    <div>
      <MaterialTable columns={columns} data={logs} />
    </div>
  )
}

