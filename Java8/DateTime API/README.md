## Features
- Substitute to java.util.Date and java.util.Calendar 
- Thread safe 
- Easy to work with 
- Time Zone logic

## Classes
### LocalDate, LocalTime, LocalDateTime, MonthDay and YearMonth
- LocalDate: day data type eg: 2022-02-14
- LocalTime: time data type eg: 20:04:00
- LocalDateTime: day and time data type eg: 20:04:00 2022-02-14
- MonthDay: Month and Day data type eg: --04-09
- YearMonth: Year and Month data type eg: 2024-04

### Instant, ZoneId and ZonedDateTime
- Instant: Object representing a point in time eg: 2024-04-09T18:42:24.381Z
- ZonedDateTime: Object representing a date and time with time zone eg: 2024-04-10T00:15:00.629+05:30[Asia/Calcutta]
- ZoneId eg: Asia/Calcutta

### Clock Class, Comparing Dates and Times and DateTimeFormatter
#### Clock:
- Abstract class that provides access to instant, date and time using a time zone 
- Usage is optional and allows alternate clocks 
- System factory methods(.now() rely on System.currentTimeMillis())

#### Comparing Dates and Times
- Built-in methods:
- compareTo()
- isAfter()
- isBefore()
- isEqual()

#### DateTimeFormatter
- Supported package: Java.time.format
- A Formatter is used for parsing and printing date and time objects
- Predefined formats 
- Supported Custom format using patterns


### Period, Duration, Altering Dates and Times
#### Period
Represents an amount of time in days,months and years

#### Duration
Represents an amount of time in seconds or nanoseconds. 
Minutes, Hours or days can also be used to work with durations.

#### Altering Dates and Times
Immutable classes Perform calculation with plus and minus methods
Use Duration and period to do calculations 
The with() and with..() methods to get a new object with updated value
