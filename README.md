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

