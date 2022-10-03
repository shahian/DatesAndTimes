# DatesAndTimes
Date Time API is one of the biggest features of Java 8 release.
in this project, the Java 8 Date Time API Classes have used.

Date Time API Packages
Java 8 Date Time API consists of following packages.
java.time: This is the base package of the new Java Date Time API. All the major base classes are part of this package, such as LocalDate, LocalTime, LocalDateTime, Instant, Period, Duration, etc. All of these classes are immutable and thread-safe. Most of the time, these classes will be sufficient for handling common requirements.
java.time.chrono: This package defines generic APIs for non-ISO calendar systems. We can extend AbstractChronology class to create our own calendar system.
java.time.format: This package contains classes used for formatting and parsing date-time objects. Most of the time we would not be directly using them because of principle classes in java.time package provides formatting and parsing methods.
java.time.temporal: This package contains temporal objects and we can use it to find out the specific dates or times related to the date/time objects. For example, we can use these to find out the first or last day of the month. You can identify these methods easily because they always have the format “withXXX”.
java.time.zone Package: This package contains classes for supporting different time zones and their rules.
