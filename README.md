# 🎓 Student Exception Handling Project

This is a **Java project** to manage student records using proper **exception handling**.  

---

## 🚀 Features
- 📝 **Add Student**: Name, Roll Number, Marks  
- ✅ **Validation**:
  - Marks should be between **0-100** (`InvalidMarksException`)  
  - Roll number must be **>0**  
  - Name cannot be empty (`StudentNotFoundException`)  
- 📂 **File Handling**: Stores student details in a **text file** (`D:\student.txt`) in **append mode**  
- 🔍 **Search Student** by name  
- 🎛️ **Menu-driven program** for adding & searching multiple students  
- ⚡ Demonstrates **Checked & Unchecked Exceptions**:
  - `InvalidMarksException` (custom)  
  - `StudentNotFoundException` (custom)  
  - `IOException` (file operations)  

---

## 🏃 How to Run
1. Import the project in any **Java IDE** (Eclipse, IntelliJ, NetBeans).  
2. Run `Driver.java` from `Features` package.  
3. Follow the interactive **menu** to add or search students:  

1️⃣ Add Student
2️⃣ Find Student
3️⃣ Exit

yaml
Copy code

---

## ⚠️ Exception Handling
- ❌ **Invalid Marks** → throws `InvalidMarksException`  
- ❌ **Empty or Null Name** → throws `StudentNotFoundException`  
- ❌ **File Error** → throws `IOException`  

---

## 💡 Tip
- You can **enter multiple students** one by one.  
- Search students by name to see their details instantly.  
- Ideal project to **practice Java exceptions, file handling, and OOP concepts**.  

---

Enjoy coding! 😎🎉
