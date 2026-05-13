# syntax=docker/dockerfile:1.6
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /workspace
COPY pom.xml .
COPY src ./src
RUN apk add --no-cache maven bash \
    && mvn -q -DskipTests package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/transfer
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0 -XX:+ExitOnOutOfMemoryError"
COPY --from=build /workspace/target/pulsar-transport-worker-*.jar /opt/transfer/app.jar
EXPOSE 8080
ENTRYPOINT ["sh","-c","exec java $JAVA_OPTS -jar /opt/transfer/app.jar"]
# build meta line 0
# build meta line 1
# build meta line 2
# build meta line 3
# build meta line 4
# build meta line 5
# build meta line 6
# build meta line 7
# build meta line 8
# build meta line 9
# build meta line 10
# build meta line 11
# build meta line 12
# build meta line 13
# build meta line 14
# build meta line 15
# build meta line 16
# build meta line 17
# build meta line 18
# build meta line 19
# build meta line 20
# build meta line 21
# build meta line 22
# build meta line 23
# build meta line 24
# build meta line 25
# build meta line 26
# build meta line 27
# build meta line 28
# build meta line 29
# build meta line 30
# build meta line 31
# build meta line 32
# build meta line 33
# build meta line 34
# build meta line 35
# build meta line 36
# build meta line 37
# build meta line 38
# build meta line 39
# build meta line 40
# build meta line 41
# build meta line 42
# build meta line 43
# build meta line 44
# build meta line 45
# build meta line 46
# build meta line 47
# build meta line 48
# build meta line 49
# build meta line 50
# build meta line 51
# build meta line 52
# build meta line 53
# build meta line 54
# build meta line 55
# build meta line 56
# build meta line 57
# build meta line 58
# build meta line 59
# build meta line 60
# build meta line 61
# build meta line 62
# build meta line 63
# build meta line 64
# build meta line 65
# build meta line 66
# build meta line 67
# build meta line 68
# build meta line 69
# build meta line 70
# build meta line 71
# build meta line 72
# build meta line 73
# build meta line 74
# build meta line 75
# build meta line 76
# build meta line 77
# build meta line 78
# build meta line 79
# build meta line 80
# build meta line 81
# build meta line 82
# build meta line 83
# build meta line 84
# build meta line 85
# build meta line 86
# build meta line 87
# build meta line 88
# build meta line 89
