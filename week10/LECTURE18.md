## 231 COSI-12B-2: Advanced Programming Techniques in Java

## Lecture 18 - Mar 28, 2023

### Quote

```text
"Make it work, then make it beautiful, then if you really, really have to, make it fast. 90 percent of the time, if 
you make it beautiful, it will already be fast. So really, just make it beautiful!"
  -- Joe Armstrong
```

### Important Dates
* PA4 due Mar 28


### Topics
* Complexity & Running Time
* Comparable
* Collections

### Slides
[Lec18](Lec18.pdf)

### Summary

### Live Coding

(continued)

The goal of this exercise is to model a video store. We will have the following classes:
- Video (and subclasses Action, Drama, Comedy, Family)
  -- title
  -- flag indicating if check out
  -- how long it's been rented
  -- which copy it is (1, 2, 3, 4)
- Customer
  -- which videos they have checked out
  -- late fees they owe
- Store
  -- all videos checked out
  -- all videos not checked out
  
We will model the video store over the course of 1 week (7 days)

Each day, a customer has a 30% chance of coming in and a 50% chance of renting something
- they can only rent something available
- they will rent at random any title they don't have at home

The following day, they have a 90% chance of returning it  
- if they don't return in three days, they get charged a penalty fee

The store has the following titles:
"The Matrix"                       1 copy   (Action)
"Godfather II"                     2 copies (Drama)
"Star Wars Episode IV: A New Hope" 4 copies (Action)
"Wallace & Gromit: A Close Shave"  2 copies (Family)

Let's start with three customers : Bob, Ted and Alice


For each day, show the
* store inventory
* customer rentals
* late fees


### Discussion Overview

### Links
