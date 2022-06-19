<%@ page import="Models.Gun" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%List<Gun> guns = (List<Gun>) request.getAttribute("gunList");%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="styleResp.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <link rel="icon" href="https://ih1.redbubble.net/image.1246188203.4353/st,small,845x845-pad,1000x1000,f8f8f8.jpg">
    <title>Ammunation</title>
</head>
<body>

<!---------NAVBAR--------->

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

 <!-------RESULTSET----------->

<section id="table">
    <div class="container">
        <table class="table">
                <thead class="thead-light">
                <tr>
                    <th scope="col">Result no</th>
                    <th scope="col">Name</th>
                    <th scope="col">Type</th>
                    <th scope="col">Origin</th>
                    <th scope="col">Mass [kg]</th>
                    <th scope="col">Length [m]</th>
                    <th scope="col">Caliber [mm]</th>
                    <th scope="col">Rounds</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <% for(int i = 0; i<guns.size(); i++) { %>
                <% Gun gun = guns.get(i); %>

                <tr>
                    <th scope="row"><%=i+1%></th>
                    <td><%=gun.getName()%></td>
                    <td><%=gun.getType()%></td>
                    <td><%=gun.getOrigin()%></td>
                    <td><%=gun.getMass()%></td>
                    <td><%=gun.getLength()%></td>
                    <td><%=gun.getCaliber()%></td>
                    <td><%=gun.getRounds()%></td>
                    <td><img alt="photo" src="<%=gun.getPhoto()%>"style="height: 100px; width: 260px"></td>
                </tr>

                <% } %>

                </tbody>
        </table>
    </div>
</section>
</main>
</body>
</html>
