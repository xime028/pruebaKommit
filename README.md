# Instructions
- Create a new private repository using this one as the template.
![image](https://github.com/user-attachments/assets/03de4819-2825-42f8-a6d5-834b5b9d61fb)
- Invite Lorenzo Zuluaga ([L-Zuluaga](https://github.com/L-Zuluaga)) to the repository.
- Create a branch called `technical-challenge` were you will be adding all your work.

# Challenge
### Doubly Linked lists

A doubly linked list is a data structure consisting of nodes, where each node contains data, a reference to the next node in the sequence, and a reference to the previous node.

**Example:**
```
      head
       |
       v
+------+------+     +------+------+     +------+------+
| prev | data |     | prev | data |     | prev | data |
|  -   |  10  |     |  10  |  20  |     |  20  |  30  |
| next |      |<--->| next |      |<--->| next |      |
|  20  |      |     |  30  |      |     |  -   |      |
+------+------+     +------+------+     +------+------+
                                               ^
                                               |
                                              tail
```

Your task is to implement a doubly linked list, supporting the following operations:
- Insert head and tail
- Remove an element
- Remove repeated elements (Remove all the values matching the given value)
- Search for an element, returning it's index if found
- Size of the list

Make sure to include an example testing your implementation.

Using the following example: `{ 20, 10, 2, 56, 43, 15 }`

# Additional details
- You can resolve the challenge using the programming language of your preference.

- You have 1 hour to complete the challenge.

- After finishing, upload the changes in a Pull Request, and request review from Lorenzo Zuluaga ([L-Zuluaga](https://github.com/L-Zuluaga)).


**Good luck :)**
