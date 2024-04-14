# Use a imagem Java 17
FROM openjdk:17-alpine

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

#COPY holy-bible-acf-0.0.1-SNAPSHOT.jar /app/holy-bible-acf-0.0.1-SNAPSHOT.jar
COPY target/holy-bible-acf-0.0.1-SNAPSHOT.jar /app/holy-bible-acf-0.0.1-SNAPSHOT.jar

# Exponha a porta 8080 (se necessário)
EXPOSE 8080

# Comando padrão para executar o aplicativo quando o contêiner for iniciado
CMD ["java", "-jar", "holy-bible-acf-0.0.1-SNAPSHOT.jar"]
