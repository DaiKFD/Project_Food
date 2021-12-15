<%-- 
    Document   : ShopDetails
    Created on : Dec 12, 2021, 4:45:00 PM
    Author     : nguye
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="entity.Food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
    <%
        Food foodDetail = (Food) request.getAttribute("detail");
        String price = String.valueOf(foodDetail.getFoodPrice()).replace(".0", " VND");

    %>
    <jsp:include page="Menu.jsp"></jsp:include>
        <!-- Hero Section End -->

        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="breadcrumb__text">
                            <h2>${detail.foodName}</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Product Details Section Begin -->
    <section class="product-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__pic">
                        <div class="product__details__pic__item">
                            <img class="product__details__pic__item--large"
                                 src="${detail.foodImage}" alt="">
                        </div>
                        <div class="product__details__pic__slider owl-carousel">
                            <img data-imgbigurl="${detail.foodImage2}"
                                 src="${detail.foodImage2}" alt="">
                            <img data-imgbigurl="${detail.foodImage3}"
                                 src="${detail.foodImage3}" alt="">
                            <img data-imgbigurl="${detail.foodImage4}"
                                 src="${detail.foodImage4}" alt="">
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__text">
                        <h3>${detail.foodName}</h3>
                        <div class="product__details__rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-half-o"></i>
                            <span>(18 đánh giá)</span>
                        </div>
                        <div class="product__details__price"><%=price%></div>
                        <p>${detail.foodDesctiption}</p>
                        <div class="product__details__quantity">
                            <div class="quantity">
                                <div class="pro-qty">
                                    <input type="text" value="1">
                                </div>
                            </div>
                        </div>
                        <a href="#" class="primary-btn">Thêm Vào Giỏ Hàng</a>
                        <a href="#" class="heart-icon"><span class="icon_heart_alt"></span></a>
                        <ul>
                            <li><b>Sản Phẩm Có Sẵn</b> <span>${detail.foodAvailability} Sp</span></li>
                            <li><b>Shipping</b> <span>Toàn Quốc<samp> Miễn Phí Đơn Hàng 500.000 VND</samp></span></li>
                            <li><b>Cân Nặng</b> <span>${detail.foodWeight} Kg</span></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="product__details__tab">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab"
                                   aria-selected="true">Miêu Tả Sản Phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab"
                                   aria-selected="false">Đánh Giá<span> (1)</span></a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tabs-1" role="tabpanel">
                                <div class="product__details__tab__desc">
                                    <h6>Thông Tin Sản Phẩm</h6>
                                    <p>${detail.foodDesctiption}</p>
                                </div>
                            </div>
                            <div class="tab-pane" id="tabs-3" role="tabpanel">
                                <div class="product__details__tab__desc">
                                    <h6>Đánh Giá Sản Phẩm</h6>
                                    <p>${detail.foodDesctiption}</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Product Details Section End -->

    <!-- Related Product Section Begin -->
    <!-- Related Product Section End -->

    <!-- Footer Section Begin -->
       <jsp:include page="Footer.jsp"></jsp:include>

</body>

</html>
