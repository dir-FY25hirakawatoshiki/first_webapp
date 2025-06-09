protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // リクエストパラメータを取得する
    var username = request.getParameter("username");
    var usermail = request.getParameter("usermail");
    var content = request.getParameter("content");

    // JSPに値を送る
    request.setAttribute("username", username);
    request.setAttribute("usermail", usermail);
    request.setAttribute("content", content);

    // ビューとなるJSPを指定して表示する
    var rd = request.getRequestDispatcher("/WEB-INF/inquiry_result.jsp");
    rd.forward(request, response);
}