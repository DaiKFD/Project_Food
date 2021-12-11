<%-- 
    Document   : HomePage
    Created on : Dec 9, 2021, 3:12:28 AM
    Author     : nguye
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="jdk.nashorn.internal.runtime.regexp.joni.Regex"%>
<%@page import="entity.Food"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>CHAY FOOD</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Humberger Begin -->
        <div class="humberger__menu__overlay"></div>
        <div class="humberger__menu__wrapper">
            <div class="humberger__menu__logo">
                <a href="#"><img src="img/chayfoodlogo.png" alt=""></a>
            </div>
            <div class="humberger__menu__cart">
                <ul>
                    <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                    <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                </ul>
                <div class="header__cart__price">Tổng cộng: <span>150.000vnd</span></div>
            </div>
            <nav class="humberger__menu__nav mobile-menu">
                <ul>
                    <li class="active"><a href="./index.html">TRANG CHỦ</a></li>
                    <li><a href="./shop-grid.html">CỬA HÀNG</a></li>
                    <li><a href="#">TRANG</a>
                        <ul class="header__menu__dropdown">
                            <li><a href="./shop-details.html">CHI TIẾT CỬA HÀNG</a></li>
                            <li><a href="./shoping-cart.html">GIỎ HÀNG</a></li>
                            <li><a href="./checkout.html">THANH TOÁN</a></li>
                        </ul>
                    </li>
                    <li><a href="./blog.html">Blog</a></li>
                    <li><a href="./contact.html">LIÊN HỆ</a></li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
            <div class="header__top__right__social">
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-linkedin"></i></a>
                <a href="#"><i class="fa fa-pinterest-p"></i></a>
            </div>
            <div class="humberger__menu__contact">
                <ul>
                    <li><i class="fa fa-envelope"></i>dainthe153784@fpt.edu.vn</li>
                    <li>Giao hàng miễn phí cho tất cả đơn hàng 500.000 vnd</li>
                </ul>
            </div>
        </div>
        <!-- Humberger End -->

        <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fa fa-envelope"></i>dainthe153784@fpt.edu.vn</li>
                                    <li>Giao hàng miễn phí cho tất cả đơn hàng 500.000 vnd</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="https://www.facebook.com/DaiKFD.1404/"><i class="fa fa-facebook"></i></a>
                                </div>
                                <div class="header__top__right__auth">
                                    <a href="#"><i class="fa fa-user"></i> Đăng Nhập</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="header__logo">
                            <a href="./index.html"><img src="img/chayfoodlogo.png" alt=""></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li class="active"><a href="./index.html">Trang Chủ</a></li>
                                <li><a href="./shop-grid.html">Cửa Hàng</a></li>
                                <li><a href="#">TRANG</a>
                                    <ul class="header__menu__dropdown">
                                        <li><a href="./shop-details.html">CHI TIẾT CỬA HÀNG</a></li>
                                        <li><a href="./shoping-cart.html">GIỎ HÀNG</a></li>
                                        <li><a href="./checkout.html">THANH TOÁN</a></li>
                                    </ul>
                                </li>
                                <li><a href="./blog.html">Blog</a></li>
                                <li><a href="./contact.html">LIÊN HỆ</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3">
                        <div class="header__cart">
                            <ul>
                                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                            </ul>
                            <div class="header__cart__price">Tổng cộng: <span>150.000vnd</span></div>
                        </div>
                    </div>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->
        <%
            List<Food> lasts
                    = (List<Food>) request.getAttribute("lasts");
            List<Food> foods
                    = (List<Food>) request.getAttribute("foods");
            String regex = "^[0-9]{2}$";
            String price = "";
            int count1 = 0;
            int count2 = 0;
        %>
        <!-- Hero Section Begin -->
        <section class="hero">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Danh Mục</span>
                            </div>
                            <ul>
                                <c:forEach items="${category}" var="c">
                                    <li><a href="shop?cid=${c.categoryID}">${c.categoryName}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <div class="hero__search__form">
                                <form action="#">
                                    <input type="text" placeholder="Bạn Muốn Ăn Gì?">
                                    <button type="submit" class="site-btn">Search</button>
                                </form>
                            </div>
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <h5>+84 (0984444483)</h5>
                                    <span>hỗ trợ 24/7</span>
                                </div>
                            </div>
                        </div>
                        <div class="hero__item set-bg" data-setbg="img/hero/banner.jpg">
                            <div class="hero__text">
                                <span>Chay Sạch</span>
                                <h2>Vì Sức Khỏe<br />100% CHAY</h2>
                                <p>Nhận và Giao Hàng Miễn Phí</p>
                                <a href="#" class="primary-btn">MUA NGAY</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Categories Section Begin -->
        <section class="categories">
            <div class="container">
                <div class="row">
                    <div class="categories__slider owl-carousel">
                        <c:forEach items="${category}" var="c">
                            <div class="col-lg-3">
                                <div class="categories__item set-bg" data-setbg="${c.categoryImage}">
                                    <h5><a href="#">${c.categoryName}</a></h5>
                                </div> 
                            </div>     
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>
        <!-- Categories Section End -->

        <!-- Featured Section Begin -->
        <section class="featured spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Sản Phẩm Chay Nổi Bật</h2>
                        </div>
                    </div>
                </div>
                <div class="row featured__filter">
                    <% for (Food f : foods) {%>
                    <% price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");%>

                    <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="<%=f.getFoodImage()%>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#"><%=f.getFoodName()%></a></h6>
                                <h5><%=price%></h5>
                            </div>
                        </div>
                    </div>
                    <%}%>
                </div>
            </div>

        </section>
        <!-- Featured Section End -->

        <!-- Banner Begin -->
        <!-- Banner End -->

        <!-- Latest Product Section Begin -->
        <section class="latest-product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Mới Nhất</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">

                                    <% for (Food f : lasts) {%>
                                    <% price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");%>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%></span>
                                        </div>
                                    </a>                               
                                    <%}%>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <% for (Food f : lasts) {%>
                                    <% price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");%>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%></span>
                                        </div>
                                    </a>                               
                                    <%}%>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Bán Chạy Nhất</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">

                                    <% for (Food f : foods) {%>
                                    <% if (Pattern.matches(regex, String.valueOf(f.getFoodId()))) {%>
                                    <% price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");%>
                                    <a  href = "#" class="latest-product__item">
                                        <div class="latest-product__item__pic">

                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%></span>
                                        </div>
                                    </a>
                                    <%}%>
                                    <%}%>
                                </div>
                                <div class="latest-prdouct__slider__item">

                                    <% for (Food f : foods) {%>
                                    <% if (Pattern.matches(regex, String.valueOf(f.getFoodId()))) {%>
                                    <% price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");%>
                                    <a  href = "#" class="latest-product__item">
                                        <div class="latest-product__item__pic">

                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%> </span>
                                        </div>
                                    </a>
                                    <%}%>
                                    <%}%>                                
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Xem Nhiều Nhất</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <% for (Food f : foods) {%>
                                    <%if (count1 == 3) {
                                            break;
                                        }%>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%> </span>
                                        </div>
                                    </a>
                                    <%count1++;%>
                                    <%}%>

                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <% for (Food f : foods) {%>
                                    <%if (count2 == 3) {
                                            break;
                                        }%>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="<%=f.getFoodImage()%>" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6><%=f.getFoodName()%></h6>
                                            <span><%=price%> </span>
                                        </div>
                                    </a>
                                    <%count2++;%>
                                    <%}%>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Latest Product Section End -->
        <style>
            .blog__item__pic{
                position: absolute;
                width: 150px;
                height: 150px;
                left: 100px;

            }
            .blog__item__text{
                position: relative;
                top:140px;
            }
        </style>

        <!-- Blog Section Begin -->
        <section class="from-blog spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title from-blog__title">
                            <h2>LỢI ÍCH MUA ĐỒ CHAY TẠI CHAYFOOD</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="https://chaysach.com/wp-content/uploads/2016/06/THUANCHAY-300x300.jpg.webp" alt="">
                            </div>
                            <div class="blog__item__text">
                                <h5><a href="#">Sản phẩm chất lượng, an toàn
                                    </a></h5>
                                <p>Tất cả các mặt hàng ChayFood bán đều là những sản phẩm chất lượng,an toàn và có nguồn gốc xuất xứ rõ ràng.<br>
                                    ChayFood hiểu rằng chất lượng và tốt cho sức khỏe là yếu tố hàng đầu khi khách hàng lựa chọn thực phẩm chay.
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="https://chaysach.com/wp-content/uploads/2016/06/HAILONG-300x300.jpg.webp" alt="">
                            </div>
                            <div class="blog__item__text">
                                <h5><a href="#">Dịch vụ ưu đãi tốt nhất, đổi trả miễn phí.</a></h5>
                                <p>ChayFood luôn nỗ lực mang đến một dịch vụ ưu đãi tốt nhất cho khách hàng.<br>
                                    Chúng tôi cam kết hoàn tiền đổi trả hàng miễn phí với bất kỳ lý do gì.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="https://chaysach.com/wp-content/uploads/2016/06/ANTOAN-300x300.jpg.webp" alt="">
                            </div>
                            <div class="blog__item__text">
                                <h5><a href="#">Khuyến mãi, tặng quà và giảm giá để tri ân</a></h5>
                                <p>Chayfood luôn mong muốn khách hàng được thưởng thức nhiều hơn và tiết kiệm hơn khi đi mua sắm thực phẩm chay.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Blog Section End -->

        <!-- Footer Section Begin -->
        <footer class="footer spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6">
                        <div class="footer__about">
                            <div class="footer__about__logo">
                                <a href="./index.html"><img src="img/chayfoodlogo.png" alt=""></a>
                            </div>
                            <ul>
                                <li>Phone: +84 (0984444483)</li>
                                <li>Email: dainthe153784@fpt.edu.vn</li>
                            </ul>About Us
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                        <div class="footer__widget" name="fixFooterogiua">

                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12">
                        <div class="footer__widget">
                            <h6>Join Our Newsletter Now</h6>
                            <p>Get E-mail updates about our latest shop and special offers.</p>
                            <form action="#">
                                <input type="text" placeholder="Enter your mail">
                                <button type="submit" class="site-btn">Subscribe</button>
                            </form>
                            <div class="footer__widget__social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer__copyright">
                            <div class="footer__copyright__text"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>
                            <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>



    </body>

</html>
