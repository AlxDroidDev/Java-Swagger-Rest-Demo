#Obter Token

Para obter o token basta fazer a seguinte chamada:

```
curl -X POST \
  http://localhost:8080/api/authenticate \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 90d3ca1c-6058-4071-b068-d4a4a4058c00' \
  -H 'cache-control: no-cache' \
  -d '{
	"username": "admin",
	"password": "admin"
}'```

O token será recebido no header da Response. Para fazer as chamadas basta adicionar o token recebido no header "Authorization" das chamadas.