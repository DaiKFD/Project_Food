package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import entity.Food;
import java.util.List;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>CHAY FOOD</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Humberger Begin -->\n");
      out.write("        <div class=\"humberger__menu__overlay\"></div>\n");
      out.write("        <div class=\"humberger__menu__wrapper\">\n");
      out.write("            <div class=\"humberger__menu__logo\">\n");
      out.write("                <a href=\"#\"><img src=\"img/chayfoodlogo.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"humberger__menu__cart\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-heart\"></i> <span>1</span></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-shopping-bag\"></i> <span>3</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"header__cart__price\">Tổng cộng: <span>150.000vnd</span></div>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"humberger__menu__nav mobile-menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"./index.html\">TRANG CHỦ</a></li>\n");
      out.write("                    <li><a href=\"./shop-grid.html\">CỬA HÀNG</a></li>\n");
      out.write("                    <li><a href=\"#\">TRANG</a>\n");
      out.write("                        <ul class=\"header__menu__dropdown\">\n");
      out.write("                            <li><a href=\"./shop-details.html\">CHI TIẾT CỬA HÀNG</a></li>\n");
      out.write("                            <li><a href=\"./shoping-cart.html\">GIỎ HÀNG</a></li>\n");
      out.write("                            <li><a href=\"./checkout.html\">THANH TOÁN</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"./blog.html\">Blog</a></li>\n");
      out.write("                    <li><a href=\"./contact.html\">LIÊN HỆ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div id=\"mobile-menu-wrap\"></div>\n");
      out.write("            <div class=\"header__top__right__social\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"humberger__menu__contact\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fa fa-envelope\"></i>dainthe153784@fpt.edu.vn</li>\n");
      out.write("                    <li>Giao hàng miễn phí cho tất cả đơn hàng 500.000 vnd</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Humberger End -->\n");
      out.write("\n");
      out.write("        <!-- Header Section Begin -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"header__top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                            <div class=\"header__top__left\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><i class=\"fa fa-envelope\"></i>dainthe153784@fpt.edu.vn</li>\n");
      out.write("                                    <li>Giao hàng miễn phí cho tất cả đơn hàng 500.000 vnd</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                            <div class=\"header__top__right\">\n");
      out.write("                                <div class=\"header__top__right__social\">\n");
      out.write("                                    <a href=\"https://www.facebook.com/DaiKFD.1404/\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header__top__right__auth\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-user\"></i> Đăng Nhập</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"header__logo\">\n");
      out.write("                            <a href=\"./index.html\"><img src=\"img/chayfoodlogo.png\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <nav class=\"header__menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"active\"><a href=\"./index.html\">Trang Chủ</a></li>\n");
      out.write("                                <li><a href=\"./shop-grid.html\">Cửa Hàng</a></li>\n");
      out.write("                                <li><a href=\"#\">TRANG</a>\n");
      out.write("                                    <ul class=\"header__menu__dropdown\">\n");
      out.write("                                        <li><a href=\"./shop-details.html\">CHI TIẾT CỬA HÀNG</a></li>\n");
      out.write("                                        <li><a href=\"./shoping-cart.html\">GIỎ HÀNG</a></li>\n");
      out.write("                                        <li><a href=\"./checkout.html\">THANH TOÁN</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"./blog.html\">Blog</a></li>\n");
      out.write("                                <li><a href=\"./contact.html\">LIÊN HỆ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"header__cart\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-heart\"></i> <span>1</span></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-shopping-bag\"></i> <span>3</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"header__cart__price\">Tổng cộng: <span>150.000vnd</span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"humberger__open\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Header Section End -->\n");
      out.write("        ");

            List<Food> lasts
                    = (List<Food>) request.getAttribute("lasts");
            List<Food> foods
                    = (List<Food>) request.getAttribute("foods");
            String regex = "^[0-9]{2}$";
            String price = "";
            int count1 = 0;
            int count2 = 0;
        
      out.write("\n");
      out.write("        <!-- Hero Section Begin -->\n");
      out.write("        <section class=\"hero\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"hero__categories\">\n");
      out.write("                            <div class=\"hero__categories__all\">\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\n");
      out.write("                                <span>Danh Mục</span>\n");
      out.write("                            </div>\n");
      out.write("                            <ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                        <div class=\"hero__search\">\n");
      out.write("                            <div class=\"hero__search__form\">\n");
      out.write("                                <form action=\"#\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Bạn Muốn Ăn Gì?\">\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn\">Search</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone\">\n");
      out.write("                                <div class=\"hero__search__phone__icon\">\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone__text\">\n");
      out.write("                                    <h5>+84 (0984444483)</h5>\n");
      out.write("                                    <span>hỗ trợ 24/7</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"hero__item set-bg\" data-setbg=\"img/hero/banner.jpg\">\n");
      out.write("                            <div class=\"hero__text\">\n");
      out.write("                                <span>Chay Sạch</span>\n");
      out.write("                                <h2>Vì Sức Khỏe<br />100% CHAY</h2>\n");
      out.write("                                <p>Nhận và Giao Hàng Miễn Phí</p>\n");
      out.write("                                <a href=\"#\" class=\"primary-btn\">MUA NGAY</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("        <!-- Categories Section Begin -->\n");
      out.write("        <section class=\"categories\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"categories__slider owl-carousel\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Categories Section End -->\n");
      out.write("\n");
      out.write("        <!-- Featured Section Begin -->\n");
      out.write("        <section class=\"featured spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h2>Sản Phẩm Chay Nổi Bật</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row featured__filter\">\n");
      out.write("                    ");
 for (Food f : foods) {
      out.write("\n");
      out.write("                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat\">\n");
      out.write("                        <div class=\"featured__item\">\n");
      out.write("                            <div class=\"featured__item__pic set-bg\" data-setbg=\"");
      out.print(f.getFoodImage());
      out.write("\">\n");
      out.write("                                <ul class=\"featured__item__pic__hover\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-heart\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-retweet\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"featured__item__text\">\n");
      out.write("                                <h6><a href=\"#\">");
      out.print(f.getFoodName());
      out.write("</a></h6>\n");
      out.write("                                <h5>");
      out.print(price);
      out.write("</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- Featured Section End -->\n");
      out.write("\n");
      out.write("        <!-- Banner Begin -->\n");
      out.write("        <!-- Banner End -->\n");
      out.write("\n");
      out.write("        <!-- Latest Product Section Begin -->\n");
      out.write("        <section class=\"latest-product spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <div class=\"latest-product__text\">\n");
      out.write("                            <h4>Mới Nhất</h4>\n");
      out.write("                            <div class=\"latest-product__slider owl-carousel\">\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("\n");
      out.write("                                    ");
 for (Food f : lasts) {
      out.write("\n");
      out.write("                                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write("</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>                               \n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                    ");
 for (Food f : lasts) {
      out.write("\n");
      out.write("                                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write("</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>                               \n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <div class=\"latest-product__text\">\n");
      out.write("                            <h4>Bán Chạy Nhất</h4>\n");
      out.write("                            <div class=\"latest-product__slider owl-carousel\">\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("\n");
      out.write("                                    ");
 for (Food f : foods) {
      out.write("\n");
      out.write("                                    ");
 if (Pattern.matches(regex, String.valueOf(f.getFoodId()))) {
      out.write("\n");
      out.write("                                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
      out.write("                                    <a  href = \"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write("</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("\n");
      out.write("                                    ");
 for (Food f : foods) {
      out.write("\n");
      out.write("                                    ");
 if (Pattern.matches(regex, String.valueOf(f.getFoodId()))) {
      out.write("\n");
      out.write("                                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
      out.write("                                    <a  href = \"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write(" </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
}
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <div class=\"latest-product__text\">\n");
      out.write("                            <h4>Xem Nhiều Nhất</h4>\n");
      out.write("                            <div class=\"latest-product__slider owl-carousel\">\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                    ");
 for (Food f : foods) {
      out.write("\n");
      out.write("                                    ");
if (count1 == 3) {
                                            break;
                                        }
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write(" </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    ");
count1++;
      out.write("\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                    ");
 for (Food f : foods) {
      out.write("\n");
      out.write("                                    ");
if (count2 == 3) {
                                            break;
                                        }
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                        <div class=\"latest-product__item__pic\">\n");
      out.write("                                            <img src=\"");
      out.print(f.getFoodImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-product__item__text\">\n");
      out.write("                                            <h6>");
      out.print(f.getFoodName());
      out.write("</h6>\n");
      out.write("                                            <span>");
      out.print(price);
      out.write(" </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    ");
count2++;
      out.write("\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Latest Product Section End -->\n");
      out.write("        <style>\n");
      out.write("            .blog__item__pic{\n");
      out.write("                position: absolute;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 150px;\n");
      out.write("                left: 100px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .blog__item__text{\n");
      out.write("                position: relative;\n");
      out.write("                top:140px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!-- Blog Section Begin -->\n");
      out.write("        <section class=\"from-blog spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"section-title from-blog__title\">\n");
      out.write("                            <h2>LỢI ÍCH MUA ĐỒ CHAY TẠI CHAYFOOD</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-6\">\n");
      out.write("                        <div class=\"blog__item\">\n");
      out.write("                            <div class=\"blog__item__pic\">\n");
      out.write("                                <img src=\"https://chaysach.com/wp-content/uploads/2016/06/THUANCHAY-300x300.jpg.webp\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"blog__item__text\">\n");
      out.write("                                <h5><a href=\"#\">Sản phẩm chất lượng, an toàn\n");
      out.write("                                    </a></h5>\n");
      out.write("                                <p>Tất cả các mặt hàng ChayFood bán đều là những sản phẩm chất lượng,an toàn và có nguồn gốc xuất xứ rõ ràng.<br>\n");
      out.write("                                    ChayFood hiểu rằng chất lượng và tốt cho sức khỏe là yếu tố hàng đầu khi khách hàng lựa chọn thực phẩm chay.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-6\">\n");
      out.write("                        <div class=\"blog__item\">\n");
      out.write("                            <div class=\"blog__item__pic\">\n");
      out.write("                                <img src=\"https://chaysach.com/wp-content/uploads/2016/06/HAILONG-300x300.jpg.webp\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"blog__item__text\">\n");
      out.write("                                <h5><a href=\"#\">Dịch vụ ưu đãi tốt nhất, đổi trả miễn phí.</a></h5>\n");
      out.write("                                <p>ChayFood luôn nỗ lực mang đến một dịch vụ ưu đãi tốt nhất cho khách hàng.<br>\n");
      out.write("                                    Chúng tôi cam kết hoàn tiền đổi trả hàng miễn phí với bất kỳ lý do gì.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-6\">\n");
      out.write("                        <div class=\"blog__item\">\n");
      out.write("                            <div class=\"blog__item__pic\">\n");
      out.write("                                <img src=\"https://chaysach.com/wp-content/uploads/2016/06/ANTOAN-300x300.jpg.webp\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"blog__item__text\">\n");
      out.write("                                <h5><a href=\"#\">Khuyến mãi, tặng quà và giảm giá để tri ân</a></h5>\n");
      out.write("                                <p>Chayfood luôn mong muốn khách hàng được thưởng thức nhiều hơn và tiết kiệm hơn khi đi mua sắm thực phẩm chay.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Blog Section End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("        <footer class=\"footer spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"footer__about\">\n");
      out.write("                            <div class=\"footer__about__logo\">\n");
      out.write("                                <a href=\"./index.html\"><img src=\"img/chayfoodlogo.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Phone: +84 (0984444483)</li>\n");
      out.write("                                <li>Email: dainthe153784@fpt.edu.vn</li>\n");
      out.write("                            </ul>About Us\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                        <div class=\"footer__widget\" name=\"fixFooterogiua\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Join Our Newsletter Now</h6>\n");
      out.write("                            <p>Get E-mail updates about our latest shop and special offers.</p>\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter your mail\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"footer__widget__social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"footer__copyright\">\n");
      out.write("                            <div class=\"footer__copyright__text\"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>\n");
      out.write("                            <div class=\"footer__copyright__payment\"><img src=\"img/payment-item.png\" alt=\"\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a href=\"shop?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-lg-3\">\n");
          out.write("                                <div class=\"categories__item set-bg\" data-setbg=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <h5><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                </div> \n");
          out.write("                            </div>     \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
