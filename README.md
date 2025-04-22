# JPA Pageable

## Docker
<ul>
    <li><b>Limpar Docker:</b> docker stop $(docker ps -a -q)</li>
    <li><b>Derrubar o container:</b> docker-compose down</li>
    <li><b>Build: </b> mvn clean package -Dmaven.test.skip=true</li>
    <li><b>Atualizar imagem:</b> docker build -t paginable-app .</li>
    <li><b>Subir o container:</b> docker-compose up --build</li>
</ul>

## Spring Boot
Subir a aplicação pela IDE. Para subir pelo Docker descomente o app no compose.yaml e siga os passos acima.

## Json para criação de 50 registros no banco
```json
[
    { "name": "User 1", "email": "user1@example.com", "balance": 100.00 },
    { "name": "User 2", "email": "user2@example.com", "balance": 200.00 },
    { "name": "User 3", "email": "user3@example.com", "balance": 300.00 },
    { "name": "User 4", "email": "user4@example.com", "balance": 400.00 },
    { "name": "User 5", "email": "user5@example.com", "balance": 500.00 },
    { "name": "User 6", "email": "user6@example.com", "balance": 600.00 },
    { "name": "User 7", "email": "user7@example.com", "balance": 700.00 },
    { "name": "User 8", "email": "user8@example.com", "balance": 800.00 },
    { "name": "User 9", "email": "user9@example.com", "balance": 900.00 },
    { "name": "User 10", "email": "user10@example.com", "balance": 1000.00 },
    { "name": "User 11", "email": "user11@example.com", "balance": 1100.00 },
    { "name": "User 12", "email": "user12@example.com", "balance": 1200.00 },
    { "name": "User 13", "email": "user13@example.com", "balance": 1300.00 },
    { "name": "User 14", "email": "user14@example.com", "balance": 1400.00 },
    { "name": "User 15", "email": "user15@example.com", "balance": 1500.00 },
    { "name": "User 16", "email": "user16@example.com", "balance": 1600.00 },
    { "name": "User 17", "email": "user17@example.com", "balance": 1700.00 },
    { "name": "User 18", "email": "user18@example.com", "balance": 1800.00 },
    { "name": "User 19", "email": "user19@example.com", "balance": 1900.00 },
    { "name": "User 20", "email": "user20@example.com", "balance": 2000.00 },
    { "name": "User 21", "email": "user21@example.com", "balance": 2100.00 },
    { "name": "User 22", "email": "user22@example.com", "balance": 2200.00 },
    { "name": "User 23", "email": "user23@example.com", "balance": 2300.00 },
    { "name": "User 24", "email": "user24@example.com", "balance": 2400.00 },
    { "name": "User 25", "email": "user25@example.com", "balance": 2500.00 },
    { "name": "User 26", "email": "user26@example.com", "balance": 2600.00 },
    { "name": "User 27", "email": "user27@example.com", "balance": 2700.00 },
    { "name": "User 28", "email": "user28@example.com", "balance": 2800.00 },
    { "name": "User 29", "email": "user29@example.com", "balance": 2900.00 },
    { "name": "User 30", "email": "user30@example.com", "balance": 3000.00 },
    { "name": "User 31", "email": "user31@example.com", "balance": 3100.00 },
    { "name": "User 32", "email": "user32@example.com", "balance": 3200.00 },
    { "name": "User 33", "email": "user33@example.com", "balance": 3300.00 },
    { "name": "User 34", "email": "user34@example.com", "balance": 3400.00 },
    { "name": "User 35", "email": "user35@example.com", "balance": 3500.00 },
    { "name": "User 36", "email": "user36@example.com", "balance": 3600.00 },
    { "name": "User 37", "email": "user37@example.com", "balance": 3700.00 },
    { "name": "User 38", "email": "user38@example.com", "balance": 3800.00 },
    { "name": "User 39", "email": "user39@example.com", "balance": 3900.00 },
    { "name": "User 40", "email": "user40@example.com", "balance": 4000.00 },
    { "name": "User 41", "email": "user41@example.com", "balance": 4100.00 },
    { "name": "User 42", "email": "user42@example.com", "balance": 4200.00 },
    { "name": "User 43", "email": "user43@example.com", "balance": 4300.00 },
    { "name": "User 44", "email": "user44@example.com", "balance": 4400.00 },
    { "name": "User 45", "email": "user45@example.com", "balance": 4500.00 },
    { "name": "User 46", "email": "user46@example.com", "balance": 4600.00 },
    { "name": "User 47", "email": "user47@example.com", "balance": 4700.00 },
    { "name": "User 48", "email": "user48@example.com", "balance": 4800.00 },
    { "name": "User 49", "email": "user49@example.com", "balance": 4900.00 },
    { "name": "User 50", "email": "user50@example.com", "balance": 5000.00 }
]