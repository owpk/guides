export interface ITransformedLogs {
  objId: string
  content: string
  transformed: boolean
}

export interface LogMsgProps {
  readonly logs: ITransformedLogs[]
  readonly total?: number
}

