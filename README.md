# 🥚 **Egg Packaging Calculator**

This program helps determine how to pack a given number of eggs into standard cartons efficiently. It’s designed to simulate a real-world **bulk packing scenario** for an egg production company.

-----

## 🚀 **Purpose**

When producing eggs in **bulk**, companies need to pack them into cartons of fixed sizes. The goals are to:

  * Use the **least number of cartons** possible.
  * **Minimize leftover eggs** that don’t fit into standard cartons.
  * Provide a clear **packing plan** for production or shipment.

This program takes the total number of eggs and calculates how many cartons of each size are required.

-----

## 🛠️ **How It Works**

**Input:**

  * User enters the **total number of eggs** to pack.

**Carton sizes considered:**

  * **30, 24, 18, 12, 6** eggs per carton (largest to smallest).

**Algorithm:**

1.  Start with the largest carton and determine how many **full cartons** can be used.
2.  Move to smaller cartons for **remaining eggs**.
3.  Continue until all eggs are packed or cannot fit any carton.

**Output:**

  * Number of cartons for each size.
  * Eggs that cannot fit any carton (**leftovers**).
  * **Total cartons** used.

-----

## 🏃 **How to Run**

Download the **`EggPackagingCalculator.java`** file and run it using **Java**, or try it in any online Java compiler.

-----

## 📖 **Example**

**Input:**

```text
Enter total number of eggs: 77
```

**Output:**

```text
Egg Packaging Plan:
30-egg cartons: 2
12-egg cartons: 1
Leftover eggs: 5
Total cartons: 3
```

**Explanation:**

2 × 30-egg cartons → **60 eggs packed**

1 × 12-egg carton → **12 eggs packed**

5 eggs remain that cannot fit into any standard carton (**leftovers**).

**Total cartons used** = 3

-----

## 🎯 **Learning Outcomes**

This project demonstrates:

  * Use of **user input** in Java (**Scanner**)
  * Application of **loops** and **modular arithmetic** to calculate cartons and leftovers
  * Writing **clean and readable code** with meaningful variable names and comments
  * Practical **problem-solving** inspired by real-world logistics

-----

## 🔧 **Reusable & Contribution**

This program is **open-source** under the **MIT License**.
Feel free to use, modify, or extend this code for your own learning or programs.

If you improve it or add new features, I’d love to hear about it\! 🚀

-----

## 👤 **Author**

**Asim**
