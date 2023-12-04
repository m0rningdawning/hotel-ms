import React, { useState } from "react";
import HmsFooter from "../../components/footer/HmsFooter";
import HmsHeader from "../../components/header/HmsHeader";
import "./Login.css";

const activeTab = (e: any) => {
  const tabs = document.querySelectorAll(".nav-link");
  tabs.forEach((tab) => {
    tab.classList.remove("active-login-register");
  });
  e.target.classList.add("active-login-register");

  const tabId = e.target.getAttribute("href");
  const content = document.querySelector(tabId);
  if (content) {
    const allContent = document.querySelectorAll(".tab-pane");
    allContent.forEach((item) => {
      item.classList.remove("show", "active");
    });
    content.classList.add("show", "active");
  }
};

const Login = () => {
  const [isChecked, setIsChecked] = useState(false);
  const [isRegisterClicked, setIsRegisterClicked] = useState(false);

  return (
    <>
      <HmsHeader />
      <div className="content-wrapper-login">
        <div>
          <ul
            className="nav nav-pills nav-justified mb-3"
            id="ex1"
            role="tablist"
          >
            <li className="nav-item" role="presentation">
              <a
                id="form-tab-login"
                className="nav-link active-login-register"
                data-mdb-toggle="pill"
                href="#pills-login"
                role="tab"
                aria-controls="pills-login"
                aria-selected="true"
                onClick={(event) => {
                  setIsRegisterClicked(true);
                  activeTab(event);
                }}
              >
                Login
              </a>
            </li>
            <li className="nav-item" role="presentation">
              <a
                className="nav-link"
                id="form-tab-register"
                data-mdb-toggle="pill"
                href="#pills-register"
                role="tab"
                aria-controls="pills-register"
                aria-selected="false"
                onClick={(event) => {
                  setIsRegisterClicked(true);
                  activeTab(event);
                }}
              >
                Register
              </a>
            </li>
          </ul>

          <div className="tab-content">
            <div
              className={`tab-pane fade ${
                !isRegisterClicked ? "show active" : ""
              }`}
              id="pills-login"
              role="tabpanel"
              aria-labelledby="tab-login"
            >
              <form>
                <p className="text-center">Sign in:</p>

                <div className="form-outline mb-4">
                  <input type="email" id="loginName" className="form-control" />
                  <label className="form-label" htmlFor="loginName">
                    Email or username
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input
                    type="password"
                    id="loginPassword"
                    className="form-control"
                  />
                  <label className="form-label" htmlFor="loginPassword">
                    Password
                  </label>
                </div>

                <div className="row mb-4">
                  <div className="col-md-6 d-flex justify-content-center">
                    <div className="form-check mb-3 mb-md-0">
                      <input
                        className="form-check-input"
                        type="checkbox"
                        value=""
                        id="loginCheck"
                        checked={isChecked}
                        onChange={() => setIsChecked(!isChecked)}
                      />
                      <label className="form-check-label" htmlFor="loginCheck">
                        {" "}
                        Remember me{" "}
                      </label>
                    </div>
                  </div>

                  <div className="col-md-6 d-flex justify-content-center">
                    <a className="form-hyperlink" href="#!">
                      Forgot password?
                    </a>
                  </div>
                </div>

                <button
                  type="submit"
                  id="form-submit-login-btn"
                  className="form-login-register-btn mb-4"
                >
                  Sign in
                </button>

                <div className="text-center">
                  <p>
                    Not a member?{" "}
                    <a
                      className="form-hyperlink"
                      href="#pills-register"
                      onClick={(event) => {
                        event.preventDefault();
                        setIsRegisterClicked(true);
                        document.getElementById("form-tab-register")?.click();
                      }}
                    >
                      Register
                    </a>
                  </p>
                </div>
              </form>
            </div>

            <div
              className={`tab-pane fade ${
                isRegisterClicked ? "show active" : ""
              }`}
              id="pills-register"
              role="tabpanel"
              aria-labelledby="tab-register"
            >
              <form>
                <p className="text-center">Register:</p>

                <div className="form-outline mb-4">
                  <input
                    type="text"
                    id="registerName"
                    className="form-control"
                  />
                  <label className="form-label" htmlFor="registerName">
                    Name
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input
                    type="text"
                    id="registerUsername"
                    className="form-control"
                  />
                  <label className="form-label" htmlFor="registerUsername">
                    Username
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input
                    type="email"
                    id="registerEmail"
                    className="form-control"
                  />
                  <label className="form-label" htmlFor="registerEmail">
                    Email
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input
                    type="password"
                    id="registerPassword"
                    className="form-control"
                  />
                  <label className="form-label" htmlFor="registerPassword">
                    Password
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input
                    type="password"
                    id="registerRepeatPassword"
                    className="form-control"
                  />
                  <label
                    className="form-label"
                    htmlFor="registerRepeatPassword"
                  >
                    Repeat password
                  </label>
                </div>

                <button
                  type="submit"
                  id="form-submit-register-btn"
                  className="form-login-register-btn mb-4"
                >
                  Register
                </button>
              </form>
            </div>
          </div>
        </div>
      </div>
      <HmsFooter />
    </>
  );
};

export default Login;
