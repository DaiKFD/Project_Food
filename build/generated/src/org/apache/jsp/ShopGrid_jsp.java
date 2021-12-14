package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import entity.Food;
import java.util.List;

public final class ShopGrid_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
 List<Food> lasts
            = (List<Food>) request.getAttribute("lasts");
    List<Food> foodCat = (List<Food>) request.getAttribute("foodCat");
    String price = "";
    int countSoluong = foodCat.size();

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("    <!-- Product Section Begin -->\n");
      out.write("    <section class=\"product spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-5\">\n");
      out.write("                    <div class=\"sidebar\">\n");
      out.write("                        <div class=\"sidebar__item\">\n");
      out.write("                            <h4>Danh Mục</h4>\n");
      out.write("                            <ul>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar__item\">\n");
      out.write("                        <h4>Price</h4>\n");
      out.write("                        <div class=\"price-range-wrap\">\n");
      out.write("                            <div class=\"price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"\n");
      out.write("                                 data-min=\"10\" data-max=\"540\">\n");
      out.write("                                <div class=\"ui-slider-range ui-corner-all ui-widget-header\"></div>\n");
      out.write("                                <span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\"></span>\n");
      out.write("                                <span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"range-slider\">\n");
      out.write("                                <div class=\"price-input\">\n");
      out.write("                                    <input type=\"text\" id=\"minamount\">\n");
      out.write("                                    <input type=\"text\" id=\"maxamount\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar__item\">\n");
      out.write("                        <div class=\"latest-product__text\">\n");
      out.write("                            <h4>Latest Products</h4>\n");
      out.write("                            <div class=\"latest-product__slider owl-carousel\">\n");
      out.write("                                <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                    ");
 for (Food f : lasts) {
      out.write("\n");
      out.write("                                    ");
 price = String.valueOf(f.getFoodPrice()).replace(".0", " VND");
      out.write("\n");
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
      out.write("                                            <span>price</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
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
      out.write("                                            <span>price</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-9 col-md-7\">\n");
      out.write("                <div class=\"product__discount\">\n");
      out.write("                    <div class=\"section-title product__discount__title\">\n");
      out.write("                        <h2>Sale Off</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"filter__item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-5\">\n");
      out.write("                                <div class=\"filter__sort\">\n");
      out.write("                                    <span>Sort By</span>\n");
      out.write("                                    <select>\n");
      out.write("                                        <option value=\"0\">Default</option>\n");
      out.write("                                        <option value=\"0\">Default</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4 col-md-4\">\n");
      out.write("                                <div class=\"filter__found\">\n");
      out.write("                                    <h6><span>");
      out.print(countSoluong);
      out.write("</span> Sản Phẩm</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4 col-md-3\">\n");
      out.write("                                <div class=\"filter__option\">\n");
      out.write("                                    <span class=\"icon_grid-2x2\"></span>\n");
      out.write("                                    <span class=\"icon_ul\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");
 for (Food f : foodCat) {
      out.write("\n");
      out.write("                        ");
 price = String.valueOf(f.getFoodPrice()).
                                            replace(".0", " VND");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                            <div class=\"product__item\">\n");
      out.write("                                <div class=\"product__item__pic set-bg\" data-setbg=\"");
      out.print(f.getFoodImage());
      out.write("\">\n");
      out.write("                                    <ul class=\"product__item__pic__hover\">\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-heart\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-retweet\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product__item__text\">\n");
      out.write("                                    <h6><a href=\"details?fid=");
      out.print(f.getFoodId());
      out.write('"');
      out.write('>');
      out.print(f.getFoodName());
      out.write("</a></h6>\n");
      out.write("                                    <h5>");
      out.print(price);
      out.write("</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product__pagination\">\n");
      out.write("                        <a href=\"#\">1</a>\n");
      out.write("                        <a href=\"#\">2</a>\n");
      out.write("                        <a href=\"#\">3</a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-long-arrow-right\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</section>\n");
      out.write("<!-- Product Section End -->\n");
      out.write("\n");
      out.write("<!-- Footer Section Begin -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
          out.write("                                <li><a href=\"shop?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
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
