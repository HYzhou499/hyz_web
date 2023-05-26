<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/25
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title> 学术搜索 | 文献工具</title>
    <meta name='robots' content='max-image-preview:large' />
    <link rel='stylesheet' id='wp-block-library-css' href='https://c.runoob.com/wp-includes/css/dist/block-library/style.min.css?ver=6.2' type='text/css' media='all' />
    <link rel='stylesheet' id='classic-theme-styles-css' href='https://c.runoob.com/wp-includes/css/classic-themes.min.css?ver=6.2' type='text/css' media='all' />
    <link rel='stylesheet' id='wpProQuiz_front_style-css' href='https://c.runoob.com/wp-content/plugins/Wp-Pro-Quiz/css/wpProQuiz_front.min.css?ver=0.37' type='text/css' media='all' />
    <link rel="canonical" href="https://c.runoob.com/scholar/" />
    <meta name="keywords" content="学术搜索">
    <meta name="description" content="文献工具-学术搜索..">
    <link rel="shortcut icon" href="https://static.runoob.com/images/c-runoob-logo.ico">


    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="https://c.runoob.com/wp-content/themes/toolrunoob2/bootstrap.min.css">

    <!-- Custom Fonts -->
    <link href="https://cdn.staticfile.org/font-awesome/5.15.4/css/all.min.css" rel="stylesheet" type="text/css">
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- PHP 代码 -->
    <link rel="stylesheet" href="https://c.runoob.com/wp-content/themes/toolrunoob2/style.css?version=1.309">

    <script src="https://cdn.staticfile.org/jquery/2.2.4/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/clipboard.js/2.0.4/clipboard.min.js"></script>

</head>
<body>
<div class="runoob-home-main mt-4">
    <div class="container" style="max-width: 1600px;">
        <div class="row runoob-item" data-text="学术搜索" id="runoob-goto-76">
            <div class="col-md-12">
                <div class="runoob-item-name">
                    <div class="d-inline">
                        <i class="fa fa-list"></i>
                    </div>
                    <div class="d-inline">
                        学术搜索        </div>
                </div>
            </div>
            <div class="col-md-12 nav-moredata">

                <ul id="runoob_link_cate_76" style="">
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="站点流量 — 查看并分析任何网站" href="https://www.similarweb.com/zh/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Similarweb.jpg">  SimilarWeb        </a>
                        <p class="desc"> 站点流量 — 查看并分析任何网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="精品论文搜索网站" href="https://www.cnki.net/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/zw-logo.png">  知网        </a>
                        <p class="desc"> 精品论文搜索网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个可以下载任意文献杂志的工具" href="http://www.sci-hub.se/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/sci-hub.png">  sci-hub        </a>
                        <p class="desc"> 一个可以下载任意文献杂志的工具</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个多学科的学术搜索引擎，提供对全球异构学术资源的集成检索服务" href="http://www.base-search.net/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/BASE.png">  BASE        </a>
                        <p class="desc"> 一个多学科的学术搜索引擎，提供对全球异构学术资源的集成检索服务</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="Google 提供的免费搜索学术文章" href="https://scholar.google.com/?hl=zh-CN" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/gugexueshu.jpg">  谷歌学术        </a>
                        <p class="desc"> Google 提供的免费搜索学术文章</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="提供生物医学方面的论文搜寻以及摘要，并且免费搜寻的数据库" href="https://pubmed.ncbi.nlm.nih.gov/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/pubmed-logo.jpeg">  PubMed        </a>
                        <p class="desc"> 提供生物医学方面的论文搜寻以及摘要，并且免费搜寻的数据库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个学术信息搜索引擎" href="http://xueshu.baidu.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/baidu-xueshu.png">  百度学术        </a>
                        <p class="desc"> 一个学术信息搜索引擎</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个方便快捷的查阅国外各类期刊文献的综合网络平台" href="http://cnplinker.cnpeak.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Cnpiec-LINK-service.jpg">  Cnpiec LINK service        </a>
                        <p class="desc"> 一个方便快捷的查阅国外各类期刊文献的综合网络平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="由PMC存档生物医学，生命科学科研文献，可以免费下载" href="http://www.ncbi.nlm.nih.gov/pmc/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/PMC.png">  PMC（PubMed Cenral)        </a>
                        <p class="desc"> 由PMC存档生物医学，生命科学科研文献，可以免费下载</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="OA期刊目录网站" href="https://doaj.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/DOAJ.png">  DOAJ        </a>
                        <p class="desc"> OA期刊目录网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="文献资料多，搜索下载方便" href="http://zh.booksc.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/booksc.png">  BookSC        </a>
                        <p class="desc"> 文献资料多，搜索下载方便</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="网站上面的文章大多数都是会投稿到学术期刊的文章，文章类型内容分类非常专业和全面" href="https://arxiv.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/arXiv.png">  arXiv        </a>
                        <p class="desc"> 网站上面的文章大多数都是会投稿到学术期刊的文章，文章类型内容分类非常专业和全面</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个涵盖期刊、会议纪要、论文、学术成果、学术会议论文的大型网络数据库" href="http://www.wanfangdata.com.cn/index.html" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/wanfangshujuku.png">  万方数据库        </a>
                        <p class="desc"> 一个涵盖期刊、会议纪要、论文、学术成果、学术会议论文的大型网络数据库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="科学论文专业网站" href="http://www.paper.edu.cn/releasepaper/index.shtml" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/zhongguokejilunwenzaixian.png">  中国科技论文在线        </a>
                        <p class="desc"> 科学论文专业网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="致力于让中国人可以免费获得高质量的文献" href="http://www.oalib.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/OA.png">  oaLib        </a>
                        <p class="desc"> 致力于让中国人可以免费获得高质量的文献</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一家由众多诺贝尔奖得主和慈善机构支持的非赢利性学术组织" href="https://www.plos.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/PublicLibrary-of-Science.png">  PublicLibrary of Science        </a>
                        <p class="desc"> 一家由众多诺贝尔奖得主和慈善机构支持的非赢利性学术组织</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个旨在为用户提供OA资源检索和全文链接服务的公共服务平台" href="http://www.socolar.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Socolar.jpg">  Socolar        </a>
                        <p class="desc"> 是一个旨在为用户提供OA资源检索和全文链接服务的公共服务平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个学术期刊检索平台" href="http://www.yuntsg.com" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Pubmed.png">  本地Pubmed        </a>
                        <p class="desc"> 一个学术期刊检索平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="所有期刊都是开源的，可免费下载所有期刊全文" href="http://www.scirp.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Scientific-Research-Publishing.jpg">  Scientific Research Publishing        </a>
                        <p class="desc"> 所有期刊都是开源的，可免费下载所有期刊全文</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="日本国立材料研究，报告当前的科研进展以及材料科学的重要趋势" href="http://www.nims.go.jp/eng/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/NIMS.png">  NIMS        </a>
                        <p class="desc"> 日本国立材料研究，报告当前的科研进展以及材料科学的重要趋势</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="提供免费全文的学术文献出版商" href="http://highwire.stanford.edu/lists/allsites.dtl" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/HighWire-Press.png">  HighWire Press        </a>
                        <p class="desc"> 提供免费全文的学术文献出版商</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="开放所有研究论文，包括旗下48个杂志" href="http://www.nature.com/nature/index.html" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Nature.jpg">  Nature        </a>
                        <p class="desc"> 开放所有研究论文，包括旗下48个杂志</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="适用于投稿学术会议，为用户提供学术会议信息预报" href="https://www.meeting.edu.cn/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/zhongguo-xueshu-huiyizaixian.png">  中国学术会议在线        </a>
                        <p class="desc"> 适用于投稿学术会议，为用户提供学术会议信息预报</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="提供快捷权威的科学新闻报道，丰富实用的科学信息服务以及交流互动的网络平台" href="https://www.sciencenet.cn/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/kexuewang.png">  科学网        </a>
                        <p class="desc"> 提供快捷权威的科学新闻报道，丰富实用的科学信息服务以及交流互动的网络平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="全球科学社交网络服务网站" href="http://www.researchgate.net" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/ResearchGATE.jpg">  ResearchGATE        </a>
                        <p class="desc"> 全球科学社交网络服务网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是查询台湾一流学府之学术研究发展、辅助教学研究之最佳数据库" href="http://ejournal.press.ntu.edu.tw/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/taidaxueshuqikan.png">  台大学术期刊资料库        </a>
                        <p class="desc"> 是查询台湾一流学府之学术研究发展、辅助教学研究之最佳数据库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="科技在线电子图书馆" href="http://www.scielo.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/SciELO.jpg">  SciELO        </a>
                        <p class="desc"> 科技在线电子图书馆</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="国家科技图书文献中心" href="http://oar.nstl.gov.cn/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/NSTL.png">  NSTL        </a>
                        <p class="desc"> 国家科技图书文献中心</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="开放获取电子期刊查询系统" href="http://coreej.cceu.org.cn/index.html" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Exlibris.png">  Exlibris        </a>
                        <p class="desc"> 开放获取电子期刊查询系统</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个资源共享的哲学社会科学研究信息化平台" href="http://www.ncpssd.org" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/guojia-zhexue-shehui.jpg">  国家哲学社会科学文献中心        </a>
                        <p class="desc"> 一个资源共享的哲学社会科学研究信息化平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="网站包括管理学，社会学，工程学，信息学等学科的电子书，有英文有法文，可在线阅读" href="http://www.scholarvox.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/SCHOLARVOX-International.jpg">  SCHOLARVOX International        </a>
                        <p class="desc"> 网站包括管理学，社会学，工程学，信息学等学科的电子书，有英文有法文，可在线阅读</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="以商务数据为主，还收录了不少营销学杂志，文献等" href="https://www.ebscohost.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/EBSCO.png">  EBSCO        </a>
                        <p class="desc"> 以商务数据为主，还收录了不少营销学杂志，文献等</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="收录了各种类型的文学、经济学方面的文章，主要为英文资料" href="https://www.aeaweb.org/econlit" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/ECONLIT.jpg">  ECONLIT        </a>
                        <p class="desc"> 收录了各种类型的文学、经济学方面的文章，主要为英文资料</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="以学术研究为主，在这个网站可以找到各领域的研究报告" href="http://www.xerfi.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/XERFI.jpg">  XERFI        </a>
                        <p class="desc"> 以学术研究为主，在这个网站可以找到各领域的研究报告</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个强大的论文库" href="https://www.theses.fr/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Theses.png">  Thèses        </a>
                        <p class="desc"> 是一个强大的论文库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个英文网站，上面有很多对于法国作品、文化或者英美文化的分析" href="http://www.jstor.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/JSTOR.jpg">  JSTOR        </a>
                        <p class="desc"> 是一个英文网站，上面有很多对于法国作品、文化或者英美文化的分析</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="UMI博硕士论文数据库，是很好的国外资源共享平台" href="http://wwwlib.umi.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/UMI.png">  UMI        </a>
                        <p class="desc"> UMI博硕士论文数据库，是很好的国外资源共享平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="《工程与科学》是一本季刊，展示加州理工学院的知识生活和研究活动的生动画面" href="http://calteches.library.caltech.edu/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Engineering-Science.png">  Engineering &amp; Science        </a>
                        <p class="desc"> 《工程与科学》是一本季刊，展示加州理工学院的知识生活和研究活动的生动画面</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是BNET网站下属的信息检索平台" href="http://findarticles.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/findarticles.png">  Find Articles        </a>
                        <p class="desc"> 是BNET网站下属的信息检索平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是化学方面的免费全文网上期刊数据库" href="http://www.abc.chemistry.bsu.by/current/fulltext.htm" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/ABC-Chemistry.png">  ABC Chemistry        </a>
                        <p class="desc"> 是化学方面的免费全文网上期刊数据库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是生物医学中心运营的一个独立出版平台" href="http://www.chemistrycentral.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Chemistry-Central.png">  Chemistry Central        </a>
                        <p class="desc"> 是生物医学中心运营的一个独立出版平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="期刊信息检索系统是互联网上最大的完全分类的免费期刊信息数据库" href="http://journalseek.net/index.htm" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Genamics-JournalSeek.jpg">  Genamics JournalSeek        </a>
                        <p class="desc"> 期刊信息检索系统是互联网上最大的完全分类的免费期刊信息数据库</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个高速成长的OA学术出版机构，学科涵盖STM(科学、技术和医学)大部分领域" href="http://www.hindawi.com/journals/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Hindawi.jpg">  Hindawi        </a>
                        <p class="desc"> 是一个高速成长的OA学术出版机构，学科涵盖STM(科学、技术和医学)大部分领域</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="由英特尔专家撰写，是一份研究与技术的参考杂志" href="http://www.intel.com/technology/itj/index.htm" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Intel-Technology-Journal.jpg">  Intel Technology Journal        </a>
                        <p class="desc"> 由英特尔专家撰写，是一份研究与技术的参考杂志</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="提供麻省理工学院MIT发表的学术论文，包括原始稿，同行评议稿，最终出版的正式文档" href="http://dspace.mit.edu/handle/1721.1/49433" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/MIT-Open-Access-Articles.png">  MIT Open Access Articles        </a>
                        <p class="desc"> 提供麻省理工学院MIT发表的学术论文，包括原始稿，同行评议稿，最终出版的正式文档</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是互联网上科技文献搜索引擎之一，用于搜索期刊和专利" href="https://www.sciencedirect.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/ScienceDirect.jpg">  ScienceDirect        </a>
                        <p class="desc"> 是互联网上科技文献搜索引擎之一，用于搜索期刊和专利</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个交叉学科门户网站" href="https://www.vascoda.de/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Vascoda.jpg">  Vascoda        </a>
                        <p class="desc"> 是一个交叉学科门户网站</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="界面简洁，功能强大，速度快，能搜索到一些google搜索不到的资料" href="http://www.goole.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/Goole.png">  Goole        </a>
                        <p class="desc"> 界面简洁，功能强大，速度快，能搜索到一些google搜索不到的资料</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="在线期刊搜索引擎是一个强大的免费科学搜索引擎" href="http://www.ojose.com" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/ojose.png">  ojose        </a>
                        <p class="desc"> 在线期刊搜索引擎是一个强大的免费科学搜索引擎</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一个关于计算机和信息科学的搜索引擎" href="http://citeseer.ist.psu.edu/index;jsessionid=3BB44DCE20946343FF5221A1A8ACDED9" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/CiteSeerX.png">  CiteSeerX        </a>
                        <p class="desc"> 一个关于计算机和信息科学的搜索引擎</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="科技情报大数据挖掘与服务系统平台" href="https://www.aminer.cn/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/aminer.jpg">  AMiner        </a>
                        <p class="desc"> 科技情报大数据挖掘与服务系统平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="一站式科研服务平台" href="https://www.zhangqiaokeyan.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/05/zhangqiaokeyan.png">  掌桥科研        </a>
                        <p class="desc"> 一站式科研服务平台</p>
                    </li>

                </ul>

            </div>
        </div>

        <div class="row runoob-item" data-text="语言翻译" id="runoob-goto-98">
            <div class="col-md-12">
                <div class="runoob-item-name">
                    <div class="d-inline">
                        <i class="fa fa-list"></i>
                    </div>
                    <div class="d-inline">
                        语言翻译        </div>
                </div>
            </div>
            <div class="col-md-12 nav-moredata">

                <ul id="runoob_link_cate_98" style="">
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="100多种语言机器翻译" href="https://translate.google.com.hk/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/gugefanyi.png">  谷歌翻译        </a>
                        <p class="desc"> 100多种语言机器翻译</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="百度翻译提供即时免费200+语言翻译服务，拥有网页和APP产品" href="https://fanyi.baidu.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/bd-fy.jpeg">  百度翻译        </a>
                        <p class="desc"> 百度翻译提供即时免费200+语言翻译服务，拥有网页和APP产品</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="查词，翻译" href="https://www.iciba.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/jinshanciba.png">  金山词霸        </a>
                        <p class="desc"> 查词，翻译</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="百度出品的人工智能语言模型" href="https://yiyan.baidu.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2023/03/wxyy.png">  文心一言        </a>
                        <p class="desc"> 百度出品的人工智能语言模型</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="是一个在线翻译平台" href="https://dict.youdao.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/youdaocidian.png">  有道词典        </a>
                        <p class="desc"> 是一个在线翻译平台</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="免费、及时多种语言在线翻译" href="https://fanyi.youdao.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/youdao-fanyiguan.jpg">  有道翻译官        </a>
                        <p class="desc"> 免费、及时多种语言在线翻译</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="全世界最准确的翻译" href="https://www.deepl.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/deepl.jpg">  DeepL        </a>
                        <p class="desc"> 全世界最准确的翻译</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="在线翻译" href="https://fanyi.caiyunapp.com/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/caiyun-xiaoyi.png">  彩云小译        </a>
                        <p class="desc"> 在线翻译</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="在线语法、样式和拼写检查" href="https://languagetool.org/" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/language.jpg">  Language Tool        </a>
                        <p class="desc"> 在线语法、样式和拼写检查</p>
                    </li>
                    <li class="lia" >
                        <a  style="padding: 7px 0 0 0;" data-toggle="tooltip" data-placement="bottom" rel="nofollow" title="拼写和语法检查器" href="https://www.microsoft.com/zh-cn/microsoft-365/microsoft-editor" target="_blank" class="runoob-custom-link">
                            <img width="24" height="24" src="https://c.runoob.com/wp-content/uploads/2022/06/Editor.jpg">  微软 Editor        </a>
                        <p class="desc"> 拼写和语法检查器</p>
                    </li>

                </ul>

            </div>
        </div>
    </div>

</div>
<script>
    var data_hrefs = ["76","98"];
</script>










<script>


    $(function() {
        //代码高亮
        $('pre').each(function() {
            if(!$(this).hasClass("prettyprint")) {
                $(this).addClass("prettyprint");
            }
        });

        $('[data-toggle="tooltip"]').tooltip();

        if(is_home) {
            $(window).scroll(function () {
                var _stop = $(window).scrollTop();
                if(_stop>=100) {
                    $("#go-top").fadeIn();

                }else {
                    $("#go-top").fadeOut();
                }
            });
            _current_hash = window.location.hash;
            console.log(_current_hash);
            if(_current_hash) {

                var $targetEle = $(_current_hash);
                var sTop =  $targetEle.offset().top;
                $('html, body').stop().animate({
                    'scrollTop':sTop-100
                }, 300, 'swing', function (e) {
                    // window.location.hash = targetEle;
                });
                console.log(sTop);
                return false;

            }
            $("#go-top").click(function(event){
                $('html,body').animate({scrollTop:0}, 100);
                return false;
            });
            // 导航
            var _html_nav='<a class="nav-link active" href="javascript:void();"><i class="fa fa-compass" aria-hidden="true"></i> 快速导航</a>';
            var _html_right_nav = '<button class="dropdown-item" href="#"><i class="fa fa-th-list" aria-hidden="true"></i> 快速导航</button><div class="dropdown-divider"></div>';
            var _html_left_nav = '<dt><span class="show-list"></span></dt>';
            for (var i=0;i<data_hrefs.length;i++)
            {
                id="runoob-goto-" + data_hrefs[i];
                _html_nav += '<a class="nav-link" href="#'+id+'">'+$("#"+id).data("text")+'</a>';
                _html_right_nav +='<button class="dropdown-item" onclick="location.href=\'#'+id+'\'" type="button"><i class="fa fa-caret-right" aria-hidden="true"></i> '+$("#"+id).data("text")+'</button>' ;
                _html_left_nav +='<dd><a href="#'+id+'" class="auto-scroll" data-offset="98" data-speed="500">'+$("#"+id).data("text")+'</a></dd>';
            }
            $(".nav-underline").html(_html_nav);
            $("#right_nav_list").html(_html_right_nav);
            $("#goto").html(_html_left_nav);
            if($(".nav-scroller").is(":visible")){
                $('a[href^="#"]').on('click', function (e) {
                    e.preventDefault();
                    $(this).addClass('nav-underline-active');
                    $(this).siblings().removeClass('nav-underline-active');
                    var targetEle = this.hash;
                    var $targetEle = $(targetEle);
                    var sTop =  $targetEle.offset().top;
                    $('html, body').stop().animate({
                        'scrollTop':sTop-100
                    }, 300, 'swing', function () {
                        //   window.location.hash = targetEle;
                    });
                });
            } else {
                $('a[href^="#"]').on('click', function (e) {
                    e.preventDefault();
                    var targetEle = this.hash;
                    var $targetEle = $(targetEle);
                    var sTop =  $targetEle.offset().top;
                    $('html, body').stop().animate({
                        'scrollTop':sTop-56
                    }, 300, 'swing', function () {
                        //   window.location.hash = targetEle;
                    });
                });
            }
        } else {
            $("#top").hide();
        }


        // search
        if($('#search-name').length){
            var _href=  $("#search-name .nav-underline-active").attr("href");
        }

        $('#search-name li a').each(function(){
            $(this).on("click", function(e){
                e.preventDefault();
                _href = $(this).attr('href');
                $(this).removeClass("text-muted").addClass("nav-underline-active");
                $(this).parent().siblings().find("a").addClass("text-muted").removeClass("nav-underline-active");
                //  console.log(_href);
            });

        })

        $('#search-button').on("click", function(e){
            // console.log(_href);
            _hmt.push(['_trackEvent', 'Search', 'Click', '搜索工具']);
            keyword = $(".search").find("input:text").val();
            window.open(_href + keyword, '_blank');
        });
        $(".search").find("input:text").keypress(function (e) {
            var key = e.which;
            if(key == 13)  // the enter key code
            {
                window.open(_href + $(this).val(), '_blank');
                return false;
            }
        });
    });

    (function($){
        var p=$('.runoob-item-index');
        if(p.length<1) return;
        var arr=[];
        function part_offset_top() {
            p.each(function () {
                var of=$(this).offset();
                arr.push(Math.floor(of.top));
            });
        }
        function goto_current(index) {
            var a=$('#goto dd');
            var b=$('#goto dt');
            if(a.length<1) return;
            var h=a.outerHeight();
            if (!a.eq(index).hasClass('current')) {
                a.removeClass('current');
                a.eq(index).addClass('current');
                // console.log(index)
                b.animate({
                    'top': h*index+(a.outerHeight()-b.outerHeight())/2+1
                },50);
            }
        }
        function window_scroll() {
            var st=window.pageYOffset
                || document.documentElement.scrollTop
                || document.body.scrollTop
                || 0;
            var limit=Math.ceil(st+98);
            var index=0;
            for (var i = 0; i < arr.length; i++) {
                if (limit>=arr[i]) {
                    index=i;
                }else{
                    break;
                }
            }
            if (index<0) index=0;
            if (!p.eq(index).hasClass('current')) {
                p.removeClass('current');
                p.eq(index).addClass('current');
                goto_current(index);
            }
        }
        part_offset_top();
        setTimeout(window_scroll,0);
        $(window).on('scroll',window_scroll);
    })(jQuery);
    /* --侧边栏滚动时固定-- */
    (function($){
        var s=$('.sidebar');

        if(s.length<1) return;
        var c=s.children('.content-sidebar');
        if(c.length<1) return;
        var $parent=s.parent();
        if($parent.length<1) return;
        var start=0,stop=0,cHeight=0;
        function init() {
            var soffset=s.offset();
            start=soffset.top;
            stop=start+$parent.height();
            cinit();
        }
        function cinit() {
            cHeight=c.height();
        }
        function cClear(){
            c.removeClass('fixed');
            c.removeClass('absolute');
        }
        function check_scroll(){
            var st=window.pageYOffset
                || document.documentElement.scrollTop
                || document.body.scrollTop
                || 0;
            if (st<=start) {
                cClear();
            }
            if (st>=stop-cHeight) {
                c.removeClass('fixed');
                c.addClass('absolute');
                return;
            }
            if (st<stop-cHeight && st>start) {
                c.removeClass('absolute');
                c.addClass('fixed');
            }
        }

        init();
        check_scroll();
        $(window).on('resize',init);
        $(window).on('scroll',check_scroll);
    })(jQuery);

    (function () {
        'use strict'

        document.querySelector('#navbarSideCollapse').addEventListener('click', function () {
            document.querySelector('.offcanvas-collapse').classList.toggle('open')
        })
    })()
</script>
<div style="display:none;">
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?68c6d4f0f6c20c5974b17198fa6fd40a";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
</div>

</body>
</html>
