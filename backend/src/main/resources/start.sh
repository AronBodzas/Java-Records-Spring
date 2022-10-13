createdb {your_db_name}
mvn clean package
export DB_USERNAME={your_user_name}
export DB_PASSWORD={your_password}
export DB_NAME={your_db_name}
mvn spring-boot:run