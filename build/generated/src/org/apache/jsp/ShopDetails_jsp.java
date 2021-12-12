package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShopDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Ogani | Template</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Page Preloder -->\n");
      out.write("    <div id=\"preloder\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Humberger Begin -->\n");
      out.write("    <div class=\"humberger__menu__overlay\"></div>\n");
      out.write("    <div class=\"humberger__menu__wrapper\">\n");
      out.write("        <div class=\"humberger__menu__logo\">\n");
      out.write("            <a href=\"#\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"humberger__menu__cart\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-heart\"></i> <span>1</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-shopping-bag\"></i> <span>3</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"header__cart__price\">item: <span>$150.00</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"humberger__menu__widget\">\n");
      out.write("            <div class=\"header__top__right__language\">\n");
      out.write("                <img src=\"img/language.png\" alt=\"\">\n");
      out.write("                <div>English</div>\n");
      out.write("                <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Spanis</a></li>\n");
      out.write("                    <li><a href=\"#\">English</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header__top__right__auth\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-user\"></i> Login</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"humberger__menu__nav mobile-menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"./index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"./shop-grid.html\">Shop</a></li>\n");
      out.write("                <li><a href=\"#\">Pages</a>\n");
      out.write("                    <ul class=\"header__menu__dropdown\">\n");
      out.write("                        <li><a href=\"./shop-details.html\">Shop Details</a></li>\n");
      out.write("                        <li><a href=\"./shoping-cart.html\">Shoping Cart</a></li>\n");
      out.write("                        <li><a href=\"./checkout.html\">Check Out</a></li>\n");
      out.write("                        <li><a href=\"./blog-details.html\">Blog Details</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"./blog.html\">Blog</a></li>\n");
      out.write("                <li><a href=\"./contact.html\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"mobile-menu-wrap\"></div>\n");
      out.write("        <div class=\"header__top__right__social\">\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"humberger__menu__contact\">\n");
      out.write("            <ul>\n");
      out.write("                <li><i class=\"fa fa-envelope\"></i> hello@colorlib.com</li>\n");
      out.write("                <li>Free Shipping for all Order of $99</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Humberger End -->\n");
      out.write("\n");
      out.write("    <!-- Header Section Begin -->\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <div class=\"header__top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"header__top__left\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"fa fa-envelope\"></i> hello@colorlib.com</li>\n");
      out.write("                                <li>Free Shipping for all Order of $99</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"header__top__right\">\n");
      out.write("                            <div class=\"header__top__right__social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"header__top__right__language\">\n");
      out.write("                                <img src=\"img/language.png\" alt=\"\">\n");
      out.write("                                <div>English</div>\n");
      out.write("                                <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Spanis</a></li>\n");
      out.write("                                    <li><a href=\"#\">English</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"header__top__right__auth\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-user\"></i> Login</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"header__logo\">\n");
      out.write("                        <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <nav class=\"header__menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"./index.html\">Home</a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"./shop-grid.html\">Shop</a></li>\n");
      out.write("                            <li><a href=\"#\">Pages</a>\n");
      out.write("                                <ul class=\"header__menu__dropdown\">\n");
      out.write("                                    <li><a href=\"./shop-details.html\">Shop Details</a></li>\n");
      out.write("                                    <li><a href=\"./shoping-cart.html\">Shoping Cart</a></li>\n");
      out.write("                                    <li><a href=\"./checkout.html\">Check Out</a></li>\n");
      out.write("                                    <li><a href=\"./blog-details.html\">Blog Details</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"./blog.html\">Blog</a></li>\n");
      out.write("                            <li><a href=\"./contact.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"header__cart\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-heart\"></i> <span>1</span></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-shopping-bag\"></i> <span>3</span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"header__cart__price\">item: <span>$150.00</span></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"humberger__open\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- Header Section End -->\n");
      out.write("\n");
      out.write("    <!-- Hero Section Begin -->\n");
      out.write("    <section class=\"hero hero-normal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"hero__categories\">\n");
      out.write("                        <div class=\"hero__categories__all\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                            <span>All departments</span>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Fresh Meat</a></li>\n");
      out.write("                            <li><a href=\"#\">Vegetables</a></li>\n");
      out.write("                            <li><a href=\"#\">Fruit & Nut Gifts</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Berries</a></li>\n");
      out.write("                            <li><a href=\"#\">Ocean Foods</a></li>\n");
      out.write("                            <li><a href=\"#\">Butter & Eggs</a></li>\n");
      out.write("                            <li><a href=\"#\">Fastfood</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Onion</a></li>\n");
      out.write("                            <li><a href=\"#\">Papayaya & Crisps</a></li>\n");
      out.write("                            <li><a href=\"#\">Oatmeal</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Bananas</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <div class=\"hero__search\">\n");
      out.write("                        <div class=\"hero__search__form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <div class=\"hero__search__categories\">\n");
      out.write("                                    All Categories\n");
      out.write("                                    <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" placeholder=\"What do yo u need?\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">SEARCH</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"hero__search__phone\">\n");
      out.write("                            <div class=\"hero__search__phone__icon\">\n");
      out.write("                                <i class=\"fa fa-phone\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone__text\">\n");
      out.write("                                <h5>+65 11.188.888</h5>\n");
      out.write("                                <span>support 24/7 time</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <section class=\"breadcrumb-section set-bg\" data-setbg=\"img/breadcrumb.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div class=\"breadcrumb__text\">\n");
      out.write("                        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.foodName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                        <div class=\"breadcrumb__option\">\n");
      out.write("                            <a href=\"./index.html\">Home</a>\n");
      out.write("                            <a href=\"./index.html\">Vegetables</a>\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.foodName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("    <!-- Product Details Section Begin -->\n");
      out.write("    <section class=\"product-details spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"product__details__pic\">\n");
      out.write("                        <div class=\"product__details__pic__item\">\n");
      out.write("                            <img class=\"product__details__pic__item--large\"\n");
      out.write("                                src=\"img/product/details/product-details-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product__details__pic__slider owl-carousel\">\n");
      out.write("                            <img data-imgbigurl=\"img/product/details/product-details-2.jpg\"\n");
      out.write("                                src=\"img/product/details/thumb-1.jpg\" alt=\"\">\n");
      out.write("                            <img data-imgbigurl=\"img/product/details/product-details-3.jpg\"\n");
      out.write("                                src=\"img/product/details/thumb-2.jpg\" alt=\"\">\n");
      out.write("                            <img data-imgbigurl=\"img/product/details/product-details-5.jpg\"\n");
      out.write("                                src=\"img/product/details/thumb-3.jpg\" alt=\"\">\n");
      out.write("                            <img data-imgbigurl=\"img/product/details/product-details-4.jpg\"\n");
      out.write("                                src=\"img/product/details/thumb-4.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"product__details__text\">\n");
      out.write("                        <h3>Vetgetable’s Package</h3>\n");
      out.write("                        <div class=\"product__details__rating\">\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                            <span>(18 reviews)</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product__details__price\">$50.00</div>\n");
      out.write("                        <p>Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam\n");
      out.write("                            vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet\n");
      out.write("                            quam vehicula elementum sed sit amet dui. Proin eget tortor risus.</p>\n");
      out.write("                        <div class=\"product__details__quantity\">\n");
      out.write("                            <div class=\"quantity\">\n");
      out.write("                                <div class=\"pro-qty\">\n");
      out.write("                                    <input type=\"text\" value=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\" class=\"primary-btn\">ADD TO CARD</a>\n");
      out.write("                        <a href=\"#\" class=\"heart-icon\"><span class=\"icon_heart_alt\"></span></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><b>Availability</b> <span>In Stock</span></li>\n");
      out.write("                            <li><b>Shipping</b> <span>01 day shipping. <samp>Free pickup today</samp></span></li>\n");
      out.write("                            <li><b>Weight</b> <span>0.5 kg</span></li>\n");
      out.write("                            <li><b>Share on</b>\n");
      out.write("                                <div class=\"share\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"product__details__tab\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#tabs-1\" role=\"tab\"\n");
      out.write("                                    aria-selected=\"true\">Description</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"tab\" href=\"#tabs-2\" role=\"tab\"\n");
      out.write("                                    aria-selected=\"false\">Information</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"tab\" href=\"#tabs-3\" role=\"tab\"\n");
      out.write("                                    aria-selected=\"false\">Reviews <span>(1)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane active\" id=\"tabs-1\" role=\"tabpanel\">\n");
      out.write("                                <div class=\"product__details__tab__desc\">\n");
      out.write("                                    <h6>Products Infomation</h6>\n");
      out.write("                                    <p>Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui.\n");
      out.write("                                        Pellentesque in ipsum id orci porta dapibus. Proin eget tortor risus. Vivamus\n");
      out.write("                                        suscipit tortor eget felis porttitor volutpat. Vestibulum ac diam sit amet quam\n");
      out.write("                                        vehicula elementum sed sit amet dui. Donec rutrum congue leo eget malesuada.\n");
      out.write("                                        Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur arcu erat,\n");
      out.write("                                        accumsan id imperdiet et, porttitor at sem. Praesent sapien massa, convallis a\n");
      out.write("                                        pellentesque nec, egestas non nisi. Vestibulum ac diam sit amet quam vehicula\n");
      out.write("                                        elementum sed sit amet dui. Vestibulum ante ipsum primis in faucibus orci luctus\n");
      out.write("                                        et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam\n");
      out.write("                                        vel, ullamcorper sit amet ligula. Proin eget tortor risus.</p>\n");
      out.write("                                        <p>Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Lorem\n");
      out.write("                                        ipsum dolor sit amet, consectetur adipiscing elit. Mauris blandit aliquet\n");
      out.write("                                        elit, eget tincidunt nibh pulvinar a. Cras ultricies ligula sed magna dictum\n");
      out.write("                                        porta. Cras ultricies ligula sed magna dictum porta. Sed porttitor lectus\n");
      out.write("                                        nibh. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a.\n");
      out.write("                                        Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed\n");
      out.write("                                        porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum\n");
      out.write("                                        sed sit amet dui. Proin eget tortor risus.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane\" id=\"tabs-2\" role=\"tabpanel\">\n");
      out.write("                                <div class=\"product__details__tab__desc\">\n");
      out.write("                                    <h6>Products Infomation</h6>\n");
      out.write("                                    <p>Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui.\n");
      out.write("                                        Pellentesque in ipsum id orci porta dapibus. Proin eget tortor risus.\n");
      out.write("                                        Vivamus suscipit tortor eget felis porttitor volutpat. Vestibulum ac diam\n");
      out.write("                                        sit amet quam vehicula elementum sed sit amet dui. Donec rutrum congue leo\n");
      out.write("                                        eget malesuada. Vivamus suscipit tortor eget felis porttitor volutpat.\n");
      out.write("                                        Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Praesent\n");
      out.write("                                        sapien massa, convallis a pellentesque nec, egestas non nisi. Vestibulum ac\n");
      out.write("                                        diam sit amet quam vehicula elementum sed sit amet dui. Vestibulum ante\n");
      out.write("                                        ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;\n");
      out.write("                                        Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula.\n");
      out.write("                                        Proin eget tortor risus.</p>\n");
      out.write("                                    <p>Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Lorem\n");
      out.write("                                        ipsum dolor sit amet, consectetur adipiscing elit. Mauris blandit aliquet\n");
      out.write("                                        elit, eget tincidunt nibh pulvinar a. Cras ultricies ligula sed magna dictum\n");
      out.write("                                        porta. Cras ultricies ligula sed magna dictum porta. Sed porttitor lectus\n");
      out.write("                                        nibh. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane\" id=\"tabs-3\" role=\"tabpanel\">\n");
      out.write("                                <div class=\"product__details__tab__desc\">\n");
      out.write("                                    <h6>Products Infomation</h6>\n");
      out.write("                                    <p>Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui.\n");
      out.write("                                        Pellentesque in ipsum id orci porta dapibus. Proin eget tortor risus.\n");
      out.write("                                        Vivamus suscipit tortor eget felis porttitor volutpat. Vestibulum ac diam\n");
      out.write("                                        sit amet quam vehicula elementum sed sit amet dui. Donec rutrum congue leo\n");
      out.write("                                        eget malesuada. Vivamus suscipit tortor eget felis porttitor volutpat.\n");
      out.write("                                        Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Praesent\n");
      out.write("                                        sapien massa, convallis a pellentesque nec, egestas non nisi. Vestibulum ac\n");
      out.write("                                        diam sit amet quam vehicula elementum sed sit amet dui. Vestibulum ante\n");
      out.write("                                        ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;\n");
      out.write("                                        Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula.\n");
      out.write("                                        Proin eget tortor risus.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Product Details Section End -->\n");
      out.write("\n");
      out.write("    <!-- Related Product Section Begin -->\n");
      out.write("    <!-- Related Product Section End -->\n");
      out.write("\n");
      out.write("    <!-- Footer Section Begin -->\n");
      out.write("    <footer class=\"footer spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                    <div class=\"footer__about\">\n");
      out.write("                        <div class=\"footer__about__logo\">\n");
      out.write("                            <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Address: 60-49 Road 11378 New York</li>\n");
      out.write("                            <li>Phone: +65 11.188.888</li>\n");
      out.write("                            <li>Email: hello@colorlib.com</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                    <div class=\"footer__widget\">\n");
      out.write("                        <h6>Useful Links</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">About Our Shop</a></li>\n");
      out.write("                            <li><a href=\"#\">Secure Shopping</a></li>\n");
      out.write("                            <li><a href=\"#\">Delivery infomation</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">Our Sitemap</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Who We Are</a></li>\n");
      out.write("                            <li><a href=\"#\">Our Services</a></li>\n");
      out.write("                            <li><a href=\"#\">Projects</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact</a></li>\n");
      out.write("                            <li><a href=\"#\">Innovation</a></li>\n");
      out.write("                            <li><a href=\"#\">Testimonials</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                    <div class=\"footer__widget\">\n");
      out.write("                        <h6>Join Our Newsletter Now</h6>\n");
      out.write("                        <p>Get E-mail updates about our latest shop and special offers.</p>\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter your mail\">\n");
      out.write("                            <button type=\"submit\" class=\"site-btn\">Subscribe</button>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"footer__widget__social\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"footer__copyright\">\n");
      out.write("                        <div class=\"footer__copyright__text\"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>\n");
      out.write("                        <div class=\"footer__copyright__payment\"><img src=\"img/payment-item.png\" alt=\"\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("    <!-- Js Plugins -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("    <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
}
