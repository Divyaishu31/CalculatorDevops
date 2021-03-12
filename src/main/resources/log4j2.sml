<Configuration status="INFO">
<Appenders>
<Console name="ConsoleAppender" target="SYSTEM_OUT">
<PatternLayout pattern="%d{dd/MMM/yyy:HH:mm:ss SSS} [%F] [%level] %logger{36} %msg%n"/>
</Console>
<File name="FileAppender" fileName="calculator.log" immediateFlush="false" append="true">
<PatternLayout pattern="%d{dd/MMM/yyy:HH:mm:ss SSS} [%F] [%level] %logger{36} %msg%n"/>
</File>
</Appenders>
<Loggers>
<Root level="debug">
<AppenderRef ref="ConsoleAppender"/>
<AppenderRef ref="FileAppender"/>
</Root>
</Loggers>
</Configuration>
