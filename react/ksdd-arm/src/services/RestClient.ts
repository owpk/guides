import axios from "axios";
import { ITransformedLogs } from "types/index";

class RestClient {

  createLogs(): ITransformedLogs[] {
    return [
      { objId: '1', content: "ads", transformed: true },
      { objId: '1', content: "ads", transformed: true },
      { objId: '1', content: "ads", transformed: true },
      { objId: '1', content: "ads", transformed: true },
      { objId: '1', content: "ads", transformed: true }
    ]
  }

  async fetchLogs() {
    await axios.get<ITransformedLogs[]>
      ('http://localhost:8080/api/logs')
      .then(response => setLogs(response.data))
      .catch(e => console.log(e))
  }

}

export default RestClient
