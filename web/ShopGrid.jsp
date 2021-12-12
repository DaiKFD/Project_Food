<%-- 
    Document   : ShopGrid
    Created on : Dec 12, 2021, 3:28:31 AM
    Author     : nguye
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="jdk.nashorn.internal.runtime.regexp.joni.Regex"%>
<%@page import="entity.Food"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<% List<Food> lasts
            = (List<Food>) request.getAttribute("lasts");
    List<Food> foodCat = (List<Food>) request.getAttribute("foodCat");
    String price = "";
    int countSoluong = foodCat.size();
%>
<jsp:include page="Menu.jsp"></jsp:include>

    <!-- Breadcrumb Section End -->

    <!-- Product Section Begin -->
    <section class="product spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-5">
                    <div class="sidebar">
                        <div class="sidebar__item">
                            <h4>Danh Mục</h4>
                            <ul>
                            <c:forEach items="${category}" var="c">
                                <li><a href="shop?cid=${c.categoryID}">${c.categoryName}</a></li>
                                </c:forEach>
                        </ul>
                    </div>
                    <div class="sidebar__item">
                        <h4>Price</h4>
                        <div class="price-range-wrap">
                            <div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
                                 data-min="10" data-max="540">
                                <div class="ui-slider-range ui-corner-all ui-widget-header"></div>
                                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                            </div>
                            <div class="range-slider">
                                <div class="price-input">
                                    <input type="text" id="minamount">
                                    <input type="text" id="maxamount">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="sidebar__item">
                        <div class="latest-product__text">
                            <h4>Latest Products</h4>
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
                                            <span>price</span>
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
                                            <span>price</span>
                                        </div>
                                    </a>
                                    <%}%>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 col-md-7">
                <div class="product__discount">
                    <div class="section-title product__discount__title">
                        <h2>Sale Off</h2>
                    </div>
                    <div class="filter__item">
                        <div class="row">
                            <div class="col-lg-4 col-md-5">
                                <div class="filter__sort">
                                    <span>Sort By</span>
                                    <select>
                                        <option value="0">Default</option>
                                        <option value="0">Default</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4">
                                <div class="filter__found">
                                    <h6><span><%=countSoluong%></span> Sản Phẩm</h6>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-3">
                                <div class="filter__option">
                                    <span class="icon_grid-2x2"></span>
                                    <span class="icon_ul"></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <% for (Food f : foodCat) {%>
                        <% price = String.valueOf(f.getFoodPrice()).
                                            replace(".0", " VND");%>
                        <div class="col-lg-4 col-md-6 col-sm-6">
                            <div class="product__item">
                                <div class="product__item__pic set-bg" data-setbg="<%=f.getFoodImage()%>">
                                    <ul class="product__item__pic__hover">
                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                                <div class="product__item__text">
                                    <h6><a href="details?fid=<%=f.getFoodId()%>"><%=f.getFoodName()%></a></h6>
                                    <h5><%=price%></h5>
                                </div>
                            </div>
                        </div>
                        <%}%>
                    </div>
                    <div class="product__pagination">
                        <a href="#">1</a>
                        <a href="#">2</a>
                        <a href="#">3</a>
                        <a href="#"><i class="fa fa-long-arrow-right"></i></a>
                    </div>
                </div>
            </div>
        </div>
</section>
<!-- Product Section End -->

<!-- Footer Section Begin -->
        <jsp:include page="Footer.jsp"></jsp:include>




</body>

</html>
