# CodeGymDaNang-MobileAutomation-Java-Serenity-Cucumber
1. Setup
+ Appium Studio
+ Genimotion
+ Java (SDK 7 or 8)
+ Maven
2. Các viết chương trình theo bottom up
+ Tạo file feature và viết cucumber trước (src/test/resources/features/)
+ Sau viết các method trong senarios (src/test/java/com/smartdev/vn/android/automation/scenarios). Mỗi method trong senarios phải match với từng câu trong file feature
+ Sau đó tạo file trong folder steps (src/test/java/com/smartdev/vn/steps/). File này có nhiệm vụ bắt các element trên mobile như click , enter text. 
3) Chạy test case
+ Chạy từng testcase .Chuột phải vào file test case (/src/test/java/com/smartdev/vn/android/testcases/) . Run as unit test
+ Chạy tất cả testcase . Gõ mvn test
