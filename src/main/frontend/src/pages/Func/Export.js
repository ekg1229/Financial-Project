import React, {useEffect, useState} from 'react';
import axios from 'axios';

function Export() {
  const [ho, setHo] = useState("")

  useEffect(() => {
    axios.post('/api/flask', {
    })
        .then((response) => setHo(response.data))
        .catch((error) => console.log(error))
  }, []);

  return (
      <div>
        ===================<br/>
        flask에서 가져온 데이터입니다: {ho}<br/>
        ===================
      </div>
  )
}
export default Export;