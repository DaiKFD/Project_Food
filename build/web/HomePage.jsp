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
<html>
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
        <jsp:include page="Menu.jsp"></jsp:include>
        <!-- Hero Section End -->

        <!-- Categories Section Begin -->
        <section class="categories">
            <div class="container">
                <div class="row">
                    <div class="categories__slider owl-carousel">
                        <c:forEach items="${category}" var="c">
                            <div class="col-lg-3">
                                <div class="categories__item set-bg" data-setbg="${c.categoryImage}">
                                    <h5><a href="shop?cid=${c.categoryID}">${c.categoryName}</a></h5>
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
                                    <li><a href="details?fid=<%=f.getFoodId()%>"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="details?fid=<%=f.getFoodId()%>"><%=f.getFoodName()%></a></h6>
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
                                    <a href="details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
                                    <a href="details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
                                    <a  href = "details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
                                    <a  href = "details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
                                    <a href="details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
                                    <a href="details?fid=<%=f.getFoodId()%>" class="latest-product__item">
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
      
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>

</html>
