import React from 'react';

function Signup(){
  return(
      <>
        <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
          <meta name="description" content="Bingo One page parallax responsive HTML Template "/>
          <meta name="author" content="Themefisher.com"/>

          <title>Financial Project</title>

          {/* Mobile Specific Meta */}
          <meta name="viewport" content="width=device-width, initial-scale=1"/>

          {/* Favicon */}
          <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png"/>

          {/* CSS */}
          {/* Themefisher Icon font */}
          <link rel="stylesheet" href="../../public/plugins/themefisher-font.v-2/style.css"/>
          {/* bootstrap.min css */}
          <link rel="stylesheet" href="../../public/plugins/bootstrap/dist/css/bootstrap.min.css"/>
          {/* Slick Carousel */}
          <link rel="stylesheet" href="../../public/plugins/slick-carousel/slick/slick.css"/>
          <link rel="stylesheet" href="../../public/plugins/slick-carousel/slick/slick-theme.css"/>
          {/* Main Stylesheet */}
          <link rel="stylesheet" href="../../public/css/style.css"/>
        </head>

        <body id="body">

        {/* Start Preloader */}
        <div id="preloader">
          <div className="preloader">
            <div className="sk-circle1 sk-child"></div>
            <div className="sk-circle2 sk-child"></div>
            <div className="sk-circle3 sk-child"></div>
            <div className="sk-circle4 sk-child"></div>
            <div className="sk-circle5 sk-child"></div>
            <div className="sk-circle6 sk-child"></div>
            <div className="sk-circle7 sk-child"></div>
            <div className="sk-circle8 sk-child"></div>
            <div className="sk-circle9 sk-child"></div>
            <div className="sk-circle10 sk-child"></div>
            <div className="sk-circle11 sk-child"></div>
            <div className="sk-circle12 sk-child"></div>
          </div>
        </div>
        {/* End Preloader */}

        {/* Fixed Navigation */}
        <section className="top-header">
          <div className="container-fluid">
            <div className="row">
              <div className="col-md-12">
                <ul className="currency-status">
                  <li>
                    <a href="#">
                      <i className="tf-ion-arrow-down-b down-status"></i>
                      <span>BTC/USD</span>
                      <span>15046.07</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup up-status"></i>
                      <span>ETH/USD</span>
                      <span>843.0005</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup up-status"></i>
                      <span>BCH/USD</span>
                      <span>2648.1377</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup up-status"></i>
                      <span>BTG/USD</span>
                      <span>278.0000</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup down-status"></i>
                      <span>DASH/USD</span>
                      <span>1131.8100</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup down-status"></i>
                      <span>XRP/USD</span>
                      <span>2.1956</span>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i className="tf-arrow-dropup up-status"></i>
                      <span>ZEC/USD</span>
                      <span>2.1956</span>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </section>

        <section className="header navigation">
          <div className="container">
            <div className="row">
              <div className="col-md-12">
                <nav className="navbar navbar-expand-lg">
                  <a className="navbar-brand" href="../../public/index.html">
                    <img src="../../public/images/logo.png" alt="logo"/>
                  </a>
                  <button className="navbar-toggler" type="button" data-toggle="collapse"
                          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                          aria-expanded="false" aria-label="Toggle navigation">
                    <span className="tf-ion-android-menu"></span>
                  </button>
                  <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav ml-auto">
                      <li className="nav-item active">
                        <a className="nav-link" href="../../public/index.html">Home <span
                            className="sr-only">(current)</span></a>
                      </li>
                      <li className="nav-item">
                        <a className="nav-link" href="pricing.html">종목 추천</a>
                      </li>
                      <li className="nav-item">
                        <a className="nav-link" href="faq.html">나만의 포트폴리오</a>
                      </li>
                      <li className="nav-item">
                        <a className="nav-link" href="contact.html">모의투자</a>
                      </li>
                      <li className="nav-item">
                        <a className="nav-link" href="login.html">로그인</a>
                      </li>
                      <li className="nav-item">
                        <a className="nav-link" href="signup.html">회원가입</a>
                      </li>

                      <li className="nav-item dropdown">
                        <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown"
                           role="button" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false">
                          Pages
                        </a>
                        <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                          <a className="dropdown-item" href="team.html">Team Page</a>
                          <a className="dropdown-item" href="404.html">404 Page</a>
                          <a className="dropdown-item" href="blog.html">Blog Page</a>
                        </div>
                      </li>
                    </ul>
                  </div>
                </nav>

              </div>
            </div>
          </div>
        </section>

        <section className="signin-page account">
          <div className="container">
            <div className="row">
              <div className="col-md-6 mx-auto">
                <div className="block text-center">
                  <h2 className="text-center">Create Your Account</h2>
                  <form className="text-left clearfix mt-30" action="../../public/index.html">
                    <div className="form-group">
                      <input type="text" className="form-control" placeholder="First Name"/>
                    </div>
                    <div className="form-group">
                      <input type="text" className="form-control" placeholder="Last Name"/>
                    </div>
                    <div className="form-group">
                      <input type="text" className="form-control" placeholder="Username"/>
                    </div>
                    <div className="form-group">
                      <input type="email" className="form-control" placeholder="Email"/>
                    </div>
                    <div className="form-group">
                      <input type="password" className="form-control" placeholder="Password"/>
                    </div>
                    <button type="submit" className="btn btn-main text-center">Sign In</button>
                  </form>
                  <p className="mt-20">Already hava an account ?<a href="login.html"> Login</a></p>
                </div>
              </div>
            </div>
          </div>
        </section>

        {/* start footer */}
        <footer id="footer" className="bg-one">
          <div className="top-footer">
            <div className="container">
              <div className="row">
                <div className="col-sm-3 col-md-3 col-lg-3">
                  <h3>INFORMATION</h3>
                  <ul>
                    <li><a href="#">Payment Option</a></li>
                    <li><a href="#">Free Schedule</a></li>
                    <li><a href="#">Getting Started</a></li>
                    <li><a href="#">Bitcoin Calculator</a></li>
                  </ul>
                </div>
                {/* End of .col-sm-3 */}

                <div className="col-sm-3 col-md-3 col-lg-3">
                  <h3>Our Services</h3>
                  <ul>
                    <li><a href="#">Graphic Design</a></li>
                    <li><a href="#">Web Design</a></li>
                    <li><a href="#">Web Development</a></li>
                  </ul>
                </div>
                {/* End of .col-sm-3 */}

                <div className="col-sm-3 col-md-3 col-lg-3">
                  <h3>Quick Links</h3>
                  <ul>
                    <li><a href="#">Partners</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">FAQ’s</a></li>
                    <li><a href="#">Badges</a></li>
                  </ul>
                </div>
                {/* End of .col-sm-3 */}

                <div className="col-sm-3 col-md-3 col-lg-3">
                  <h3>Follow Us</h3>
                  <ul>
                    <li>
                      <a href="">
                        Facebook
                      </a>
                    </li>
                    <li>
                      <a href="">
                        Twitter
                      </a>
                    </li>
                    <li>
                      <a href="">
                        Linkedin
                      </a>
                    </li>
                    <li>
                      <a href="">
                        Google PLus
                      </a>
                    </li>
                  </ul>
                </div>
                {/* End of .col-sm-3 */}

              </div>
            </div>
            {/* end container */}
          </div>
          <div className="footer-bottom">
            <h5>Copyright 2017. All rights reserved.</h5>
            <h6>Design and Developed by <a href="">Themefisher</a></h6>
          </div>
        </footer>
        {/* end footer */}


        {/* end Footer Area */}

        {/* Essential Scripts */}

        {/* Main jQuery */}
        <script src="../../public/plugins/jquery/dist/jquery.min.js"></script>
        {/* Bootstrap */}
        <script src="../../public/plugins/bootstrap/dist/js/popper.min.js"></script>
        <script src="../../public/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
        {/* Owl Carousel */}
        <script src="../../public/plugins/slick-carousel/slick/slick.min.js"></script>
        <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
        {/* Smooth Scroll js */}
        <script src="../../public/plugins/smooth-scroll/dist/js/smooth-scroll.min.js"></script>

        {/* Custom js */}
        <script src="../../public/js/script.js"></script>

        </body>
      </>
  )
}

export default Signup;