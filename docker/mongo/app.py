from storage import MongodbService
import uuid
from uuid import uuid4

storage = MongodbService.get_instance()

for _ in range(5):
    dto = {
       "_id": str(uuid4()),
       "message": str(uuid4()),
    }
    storage.save_data(dto)

for data in storage.get_data():
    print(data  )

