/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2023-02-03 08:51:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.body_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public final class authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Admin/.m2/repository/org/springframework/spring-webmvc/4.3.7.RELEASE/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1488353688000L));
    _jspx_dependants.put("file:/C:/Users/Admin/.m2/repository/org/springframework/spring-webmvc/4.3.7.RELEASE/spring-webmvc-4.3.7.RELEASE.jar", Long.valueOf(1666169773704L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.text.DateFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String date = dateFormat.format(new Date());

      out.write("\n");
      out.write("  \n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_spring_005feval_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_spring_005feval_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title> Facturation </title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <!-- #CSS Links -->\n");
      out.write("        <!-- Basic Styles -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../body_page/css_declare.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"containerBody\">\n");
      out.write("            <div style=\"\">\n");
      out.write("                <div>\n");
      out.write("                    <div id=\"authentification-box\">\n");
      out.write("                        <div class=\"authentHeader\">\n");
      out.write("                            <h1 class=\"logoCsys\">\n");
      out.write("                                <img src=\"img/CSYS_LOGO_2015.png\" alt=\"me\">\n");
      out.write("                            </h1>\n");
      out.write("                            <div class=\"choixLangue\">\n");
      out.write("                                <!-- langue -->\n");
      out.write("                                <ul id=\"liste_choix_langue\" class=\"header-dropdown-list hidden-xs\">\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                            <img id=\"langue_en_cours\" src=\"img/blank.gif\"> <span></span>\n");
      out.write("                                            <i class=\"fa fa-angle-down\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <ul class=\"dropdown-menu pull-right\" id=\"liste_langue\">\n");
      out.write("                                            <li lang=\"fr\">\n");
      out.write("                                                <a href=\"javascript:void(0);\">\n");
      out.write("                                                    <img abr=\"fr\">\n");
      out.write("                                                    ");
      out.write("\n");
      out.write("                                                    Français</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li lang=\"en\">\n");
      out.write("                                                <a href=\"javascript:void(0);\">\n");
      out.write("                                                    <img abr=\"en\">\n");
      out.write("                                                    ");
      out.write("\n");
      out.write("                                                    English</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li lang=\"ar\">\n");
      out.write("                                                <a href=\"javascript:void(0);\">\n");
      out.write("                                                    <img abr=\"ar\">العربية\n");
      out.write("                                                    ");
      out.write("\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"authentBody\">\n");
      out.write("                            <div class=\"logoClient\">\n");
      out.write("                                <h1>\n");
      out.write("                                    <img src=\"img/fichBase.jpg\" alt=\"\" width=\"128\" height=\"128\"/>\n");
      out.write("                                </h1>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"formContainer\">\n");
      out.write("                                <form id=\"login-form\" class=\"smart-form client-form\"\n");
      out.write("                                      novalidate=\"novalidate\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <section>\n");
      out.write("                                            <label class=\"input\">\n");
      out.write("                                                <i class=\"icon-append fa fa-user\"></i>\n");
      out.write("                                                ");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                <input id=\"username\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username_placeholder}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"\n");
      out.write("                                                       name=\"email\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </section> \n");
      out.write("                                        <section>\n");
      out.write("                                            <label class=\"input\">\n");
      out.write("                                                <i class=\"icon-append fa fa-lock\"></i>\n");
      out.write("                                                ");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                <input id=\"password\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password_placeholder}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"password\"\n");
      out.write("                                                       name=\"password\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </section>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"authentFooter\">\n");
      out.write("                            <button id=\"submit\" class=\"btn btn-primary pull-right\">\n");
      out.write("                                ");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var url_base = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url_base}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            var idModule = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idModule}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            var url_base_access = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url_base_access}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootbox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/notification/SmartNotification.min.js\"></script>\n");
      out.write("        <script src=\"js/plugin/bootstrap-plugin/bootstrap-checkbox.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/helper_functions.js\"></script>\n");
      out.write("        <script src=\"body_page_js/authentification.js?version=");
      out.print(date);
      out.write("\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005feval_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f0 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    boolean _jspx_th_spring_005feval_005f0_reused = false;
    try {
      _jspx_th_spring_005feval_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f0.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(10,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f0.setVar("url_base");
      // /WEB-INF/body_page/authentification.jsp(10,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f0.setExpression("@environment.url_base");
      int[] _jspx_push_body_count_spring_005feval_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f0 = _jspx_th_spring_005feval_005f0.doStartTag();
        if (_jspx_th_spring_005feval_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f0);
      _jspx_th_spring_005feval_005f0_reused = true;
    } finally {
      if (!_jspx_th_spring_005feval_005f0_reused) {
        _jspx_th_spring_005feval_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005feval_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f1 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    boolean _jspx_th_spring_005feval_005f1_reused = false;
    try {
      _jspx_th_spring_005feval_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f1.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(11,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f1.setVar("idModule");
      // /WEB-INF/body_page/authentification.jsp(11,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f1.setExpression("@environment.idModule");
      int[] _jspx_push_body_count_spring_005feval_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f1 = _jspx_th_spring_005feval_005f1.doStartTag();
        if (_jspx_th_spring_005feval_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f1);
      _jspx_th_spring_005feval_005f1_reused = true;
    } finally {
      if (!_jspx_th_spring_005feval_005f1_reused) {
        _jspx_th_spring_005feval_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005feval_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f2 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    boolean _jspx_th_spring_005feval_005f2_reused = false;
    try {
      _jspx_th_spring_005feval_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f2.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(12,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f2.setVar("url_base_access");
      // /WEB-INF/body_page/authentification.jsp(12,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f2.setExpression("@environment.url_base_access");
      int[] _jspx_push_body_count_spring_005feval_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f2 = _jspx_th_spring_005feval_005f2.doStartTag();
        if (_jspx_th_spring_005feval_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f2);
      _jspx_th_spring_005feval_005f2_reused = true;
    } finally {
      if (!_jspx_th_spring_005feval_005f2_reused) {
        _jspx_th_spring_005feval_005f2.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005feval_005f2);
      }
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f0_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f0.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(80,48) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setCode("input.username");
      // /WEB-INF/body_page/authentification.jsp(80,48) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setVar("username_placeholder");
      int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
        if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
      _jspx_th_spring_005fmessage_005f0_reused = true;
    } finally {
      if (!_jspx_th_spring_005fmessage_005f0_reused) {
        _jspx_th_spring_005fmessage_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005fmessage_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f1_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f1.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(88,48) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setCode("input.password");
      // /WEB-INF/body_page/authentification.jsp(88,48) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setVar("password_placeholder");
      int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
        if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
      _jspx_th_spring_005fmessage_005f1_reused = true;
    } finally {
      if (!_jspx_th_spring_005fmessage_005f1_reused) {
        _jspx_th_spring_005fmessage_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005fmessage_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f2_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f2.setParent(null);
      // /WEB-INF/body_page/authentification.jsp(99,32) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f2.setCode("button.submit");
      int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
        if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
      _jspx_th_spring_005fmessage_005f2_reused = true;
    } finally {
      if (!_jspx_th_spring_005fmessage_005f2_reused) {
        _jspx_th_spring_005fmessage_005f2.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005fmessage_005f2);
      }
    }
    return false;
  }
}