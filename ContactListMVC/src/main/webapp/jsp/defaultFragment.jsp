<div class="navbar">
    <ul class="nav nav-tabs">
        <li role="presentation" class="active">
            <a href="${pageContext.request.contextPath}/home">Home</a>
        </li>
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/mainAjaxPage">Contact List (Ajax)</a>
        </li>
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/search">Search</a>
        </li>
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/stats">Stats</a>
        </li>
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/displayContactListNoAjax">
                Contact List (No Ajax)
            </a>
        </li>
        <!-- #1 - Logout link -->
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/j_spring_security_logout">Log Out</a>
        </li> 
    </ul>
</div>
