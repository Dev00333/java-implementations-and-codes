FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

RUN mkdir -p DigitalClock/com/practice

COPY *.java DigitalClock/com/practice/

RUN javac DigitalClock/com/practice/*.java

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=builder /app/DigitalClock ./DigitalClock

CMD ["java", "DigitalClock.com.practice.Main"]