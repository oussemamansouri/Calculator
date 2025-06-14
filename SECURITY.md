# Security Policy

## Project: Calculator

**Calculator** is a simple, standalone desktop application developed in **Java** that supports basic arithmetic operations (addition, subtraction, multiplication, and division). Although this tool does not process sensitive data or require user authentication, a minimal security approach is still maintained to ensure stability and prevent potential misuse.

---

## Supported Versions

| Version | Supported |
|---------|-----------|
| 1.x     | ✅ Yes     |
| < 1.0   | ❌ No      |

---

## Reporting a Vulnerability

If you encounter a security issue or bug, please report it by providing the following details:

- Clear description of the issue
- Steps to reproduce the problem
- Suggestion or fix (if possible)

Contact: **security@yourdomain.com** (replace with your actual contact email)

---

## Security Considerations

### 1. **Input Validation**
- All user input is validated to prevent unexpected crashes (e.g., division by zero).
- Inputs are sanitized to prevent injection-like behavior, even in local environments.

### 2. **Error Handling**
- Exception handling is implemented to prevent the application from crashing due to invalid inputs or internal errors.
- Clear and user-friendly error messages are shown without exposing internal logic.

### 3. **Code Integrity**
- The source code is regularly reviewed to ensure it adheres to clean coding and secure programming practices.
- No third-party network calls or external dependencies are used that may introduce risks.

### 4. **Environment Safety**
- The calculator does not read, write, or store any data on the disk.
- It runs in a restricted desktop environment with no access to system-level functions or files.

---

## Disclaimer

This calculator application is designed for educational and general-purpose use. It should be used in a secure desktop environment and is not intended for handling sensitive financial or personal data.

No user data is stored or transmitted, making it safe for offline use.

---

## Future Improvements

- Logging of calculation history (locally, with user consent)
- Optional memory functions with sandboxed storage
- Unit testing and static code analysis for better code reliability

---
