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
                    <li class="active"><a href="home">TRANG CHỦ</a></li>
                    <li><a href="clickhome">CỬA HÀNG</a></li>
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

                                    <c:if test="${sessionScope.account != null}">
                                        <c:if test="${sessionScope.account.isAdmin == 1}">
                                            <a href="#"></i> Quản Lý Tài Khoản</a>
                                        </c:if>

                                        <c:if test="${sessionScope.account.isSell == 1}">
                                            <a href="manager"></i> Quản Lý Sản Phẩm</a>
                                        </c:if>

                                        <a href="#"><i class="fa fa-user"></i>Xin Chào ${sessionScope.account.user}</a>
                                        <a href="logout">Đăng Xuất</a>
                                    </c:if>
                                    <c:if test="${sessionScope.account == null}">
                                        <a href="login"><i class="fa fa-user"></i> Đăng Nhập</a>
                                    </c:if>

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
                            <a href="home"><img src="img/chayfoodlogo.png" alt=""></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li class="active"><a href="home">Trang Chủ</a></li>
                                <li><a href="clickhome">Cửa Hàng</a></li>
                                <li><a href="#">TRANG</a>
                                    <ul class="header__menu__dropdown">
                                        <li><a href="ShopingCart.jsp">GIỎ HÀNG</a></li>
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
                                <form action="search">
                                    <input name="search" type="text" placeholder="Bạn Muốn Ăn Gì?">
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