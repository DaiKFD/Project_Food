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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("        <!-- Categories Section Begin -->\n");
      out.write("        <section class=\"categories\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"categories__slider owl-carousel\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
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
      out.write("                            <h2>S???n Ph???m Chay N???i B???t</h2>\n");
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
      out.write("                            <h4>M???i Nh???t</h4>\n");
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
      out.write("                            <h4>B??n Ch???y Nh???t</h4>\n");
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
      out.write("                            <h4>Xem Nhi???u Nh???t</h4>\n");
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
      out.write("                            <h2>L???I ??CH MUA ????? CHAY T???I CHAYFOOD</h2>\n");
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
      out.write("                                <h5><a href=\"#\">S???n ph???m ch???t l?????ng, an to??n\n");
      out.write("                                    </a></h5>\n");
      out.write("                                <p>T???t c??? c??c m???t h??ng ChayFood b??n ?????u l?? nh???ng s???n ph???m ch???t l?????ng,an to??n v?? c?? ngu???n g???c xu???t x??? r?? r??ng.<br>\n");
      out.write("                                    ChayFood hi???u r???ng ch???t l?????ng v?? t???t cho s???c kh???e l?? y???u t??? h??ng ?????u khi kh??ch h??ng l???a ch???n th???c ph???m chay.\n");
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
      out.write("                                <h5><a href=\"#\">D???ch v??? ??u ????i t???t nh???t, ?????i tr??? mi???n ph??.</a></h5>\n");
      out.write("                                <p>ChayFood lu??n n??? l???c mang ?????n m???t d???ch v??? ??u ????i t???t nh???t cho kh??ch h??ng.<br>\n");
      out.write("                                    Ch??ng t??i cam k???t ho??n ti???n ?????i tr??? h??ng mi???n ph?? v???i b???t k??? l?? do g??.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-6\">\n");
      out.write("                        <div class=\"blog__item\">\n");
      out.write("                            <div class=\"blog__item__pic\">\n");
      out.write("                                <img src=\"https://chaysach.com/wp-content/uploads/2016/06/ANTOAN-300x300.jpg.webp\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"blog__item__text\">\n");
      out.write("                                <h5><a href=\"#\">Khuy???n m??i, t???ng qu?? v?? gi???m gi?? ????? tri ??n</a></h5>\n");
      out.write("                                <p>Chayfood lu??n mong mu???n kh??ch h??ng ???????c th?????ng th???c nhi???u h??n v?? ti???t ki???m h??n khi ??i mua s???m th???c ph???m chay.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Blog Section End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
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
}
