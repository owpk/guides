import React, { FC } from "react";
import { LogMsgProps } from "types/index";

const titles: string[] = [
  'Object id',
  'Content',
  'Is transformed'
]

export const LogMsgTableCustom: FC<LogMsgProps> = ({ logs }) => {

  return (
    <table className="table-primary">
      <thead>
        <tr>
          {titles.map((title) => (
            <th key={title}>{title}</th>
          ))}
        </tr>
      </thead>
      <tbody>
        {logs.map((item) => (
          <tr>
            <td>{item.objId}</td>
            <td>{item.content}</td>
            <td>{item.transformed ? 'yes' : 'no'}</td>
          </tr>
        ))}
      </tbody>
    </table>
  )
}
