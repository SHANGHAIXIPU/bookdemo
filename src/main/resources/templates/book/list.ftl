<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <title>book list</title>
</head>
<body>

    <#list books as book>
        <div>
            <ul>
                <li>书名:${book.name}</li>
                <li>作者:${book.author}</li>
                <li>价格:${book.price}</li>
            </ul>
        </div>
    </#list>
</body>
</html>
