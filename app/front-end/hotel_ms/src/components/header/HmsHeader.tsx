import React, { useState, useEffect } from "react";
import { Link, useLocation } from "react-router-dom";
import "./HmsHeader.css";

const HmsHeader = () => {
  const linkList = [
    { to: "/home", text: "Home Page" },
    { to: "/admin", text: "Admin Page" },
    { to: "*", text: "404 Page" },
    { to: "/login", text: "Login Page" },
  ];


  const headerTypes = ["header", "header-login"];

  const location = useLocation();
  const [scrollTransition, setScrollTransition] = useState(false);

  useEffect(() => {
    const handleScroll = () => {
      if (window.scrollY > 0) {
        setScrollTransition(true);
      } else {
        setScrollTransition(false);
      }
    };

    window.addEventListener("scroll", handleScroll);

    return () => {
      window.removeEventListener("scroll", handleScroll);
    };
  }, []);

  return (
    <header className={`${scrollTransition ? "scroll_transition" : ""} ${location.pathname === linkList[3].to ? headerTypes[1] : headerTypes[0]}`}>
      <nav className="header-nav">
        {location.pathname === linkList[0].to ? (
          <h1 className="header-h1">Home Page</h1>
        ) : location.pathname === linkList[1].to ? (
          <h1 className="header-h1">Admin Page</h1>
        ) : location.pathname === linkList[2].to ? (
          <h1 className="header-h1">404 Page</h1>
        ) : (
          <h1 className="header-h1">Login Page</h1>
        )}
        {location.pathname === linkList[0].to ? (
          <ul id="header-ul">
            <li>
              <Link to={linkList[1].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[1].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[2].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[2].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[3].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[3].text}
                </button>
              </Link>
            </li>
          </ul>
        ) : location.pathname === linkList[1].to ? (
          <ul id="header-ul">
            <li>
              <Link to={linkList[0].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[0].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[2].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[2].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[3].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[3].text}
                </button>
              </Link>
            </li>
          </ul>
        ) : location.pathname === linkList[2].to ? (
          <ul id="header-ul">
            <li>
              <Link to={linkList[0].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[0].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[1].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[1].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[3].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[3].text}
                </button>
              </Link>
            </li>
          </ul>
        ) : (
          <ul id="header-ul">
            <li>
              <Link to={linkList[0].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[0].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[1].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[1].text}
                </button>
              </Link>
            </li>
            <li>
              <Link to={linkList[3].to}>
                <button type="button" className="btn btn-outline-light">
                  {linkList[3].text}
                </button>
              </Link>
            </li>
          </ul>
        )}
      </nav>
    </header>
  );
};

export default HmsHeader;
