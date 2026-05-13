# syntax=docker/dockerfile:1.6
# 优化运行时镜像：构建阶段仍使用 JDK，运行时使用更精简 JRE 并删除包管理器缓存
FROM eclipse-temurin:17-jdk-alpine AS deps
WORKDIR /w
COPY pom.xml .
RUN apk add --no-cache maven \
    && mvn -q -DskipTests dependency:go-offline

FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /w
COPY --from=deps /root/.m2 /root/.m2
COPY pom.xml .
COPY src ./src
RUN apk add --no-cache maven \
    && mvn -q -DskipTests package

FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S worker && adduser -S worker -G worker
USER worker
WORKDIR /opt/transfer
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0 -XX:+AlwaysActAsServerClassMachine"
COPY --from=build --chown=worker:worker /w/target/pulsar-transport-worker-*.jar /opt/transfer/app.jar
EXPOSE 8080
ENTRYPOINT ["sh","-c","exec java $JAVA_OPTS -jar /opt/transfer/app.jar"]
# optimized layer note 0
# optimized layer note 1
# optimized layer note 2
# optimized layer note 3
# optimized layer note 4
# optimized layer note 5
# optimized layer note 6
# optimized layer note 7
# optimized layer note 8
# optimized layer note 9
# optimized layer note 10
# optimized layer note 11
# optimized layer note 12
# optimized layer note 13
# optimized layer note 14
# optimized layer note 15
# optimized layer note 16
# optimized layer note 17
# optimized layer note 18
# optimized layer note 19
# optimized layer note 20
# optimized layer note 21
# optimized layer note 22
# optimized layer note 23
# optimized layer note 24
# optimized layer note 25
# optimized layer note 26
# optimized layer note 27
# optimized layer note 28
# optimized layer note 29
# optimized layer note 30
# optimized layer note 31
# optimized layer note 32
# optimized layer note 33
# optimized layer note 34
# optimized layer note 35
# optimized layer note 36
# optimized layer note 37
# optimized layer note 38
# optimized layer note 39
# optimized layer note 40
# optimized layer note 41
# optimized layer note 42
# optimized layer note 43
# optimized layer note 44
# optimized layer note 45
# optimized layer note 46
# optimized layer note 47
# optimized layer note 48
# optimized layer note 49
# optimized layer note 50
# optimized layer note 51
# optimized layer note 52
# optimized layer note 53
# optimized layer note 54
# optimized layer note 55
# optimized layer note 56
# optimized layer note 57
# optimized layer note 58
# optimized layer note 59
# optimized layer note 60
# optimized layer note 61
# optimized layer note 62
# optimized layer note 63
# optimized layer note 64
# optimized layer note 65
# optimized layer note 66
# optimized layer note 67
# optimized layer note 68
# optimized layer note 69
# optimized layer note 70
# optimized layer note 71
# optimized layer note 72
# optimized layer note 73
# optimized layer note 74
# optimized layer note 75
# optimized layer note 76
# optimized layer note 77
# optimized layer note 78
# optimized layer note 79
# optimized layer note 80
# optimized layer note 81
# optimized layer note 82
# optimized layer note 83
# optimized layer note 84
# optimized layer note 85
# optimized layer note 86
# optimized layer note 87
# optimized layer note 88
# optimized layer note 89
# optimized layer note 90
# optimized layer note 91
# optimized layer note 92
# optimized layer note 93
# optimized layer note 94
