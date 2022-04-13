# AllHandsOnDeque by
```
    ▄▄▄▄▄     ▄▄    ▄▄      ▄▄
    ▀▀▀██    ████   ██      ██
       ██    ████   ▀█▄ ██ ▄█▀ ▄▄█████▄
       ██   ██  ██   ██ ██ ██  ██▄▄▄▄ ▀
       ██   ██████   ███▀▀███   ▀▀▀▀██▄
 █▄▄▄▄▄██  ▄██  ██▄  ███  ███  █▄▄▄▄▄██
  ▀▀▀▀▀    ▀▀    ▀▀  ▀▀▀  ▀▀▀   ▀▀▀▀▀▀
  William Vongphanith, Jacob Kirmayer, and Ari Gurovich
  APCS1 pd6
  HW91 -- Deque the Halls
  2022-04-13
  Time spent: ~0.7 hours
```

**Implementation checklist**:
- [x] add (addFirst and addLast)
- [x] remove (removeFirst and removeLast)
- [x] peek (peekFirst and peekLast)
- [x] push
- [x] pop
- [x] get (getFirst and getLast)
- [x] isEmpty
- [x] size
- [x] toString
- [x] clear
- [x] contains
- [x] iterator
- [x] descendingIterator
- [x] anything else in the interface

Design Decisions:
* We used almost all methods from LinkedList as methods for Deque.
* We reimplemented toString because it looks nicer than the memory address.
* It was a pain because there were a lot of methods we had to implement.