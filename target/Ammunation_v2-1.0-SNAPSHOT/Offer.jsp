<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="styleOffer.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <link rel="icon" href="https://ih1.redbubble.net/image.1246188203.4353/st,small,845x845-pad,1000x1000,f8f8f8.jpg">
    <title>Ammunation</title>
</head>
<body>
<main>    <section id = "nav-bar++">

    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/Ammunation_v2_war_exploded/"><img src="assets/logo.png"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/Ammunation_v2_war_exploded/">HOME</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Ammunation_v2_war_exploded/Offer.jsp">OFFER</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Ammunation_v2_war_exploded/AboutUs.jsp">ABOUT US</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

</section>

    <!-------------form section------------------------------->

    <section id="form">
        <h1 class="Title">Search for your dream gun!</h1>
        <form action="offer" method="get">
            <div class="form-group">
                <label for="Name">Name</label>
                <input type="text" class="form-control" id="Name" name="Name" placeholder="Enter gun name">
            </div>
            <div class="form-group">
                <label for="Type">Type</label>
                <input type="text" class="form-control" id="Type" name="Type" placeholder="Enter gun type">
            </div>
            <div class="form-group">
                <label for="Origin">Origin</label>
                <input type="text" class="form-control" id="Origin" name="Origin" placeholder="Enter gun origin">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </section>

    <!----------------footer--------------------->

    <footer>
        <div class="footer">
            <img src="assets/Ammunation_logo2.png" class="bottom-img">
        </div>
    </footer>

</main>
</body>
</html>
