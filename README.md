1. Ensure MySQL is running on your system and create a database named 'searchapp'<br>
2. Ensure Redis is running on your system.<br>
3. Run -> ./gradlew bootRun<br>
4. Testing of API - <br>
<br>
curl -X POST http://localhost:8080/api/documents \
-H 'Content-Type: application/json' \
-d '{
"title": "Sample Document",
"content": "This is a sample document.",
"author": "Author Name",
"date": "2023-05-30"
}'
<br>
5. Search Document<br>
curl -X GET "http://localhost:8080/api/documents/search?query=sample"

