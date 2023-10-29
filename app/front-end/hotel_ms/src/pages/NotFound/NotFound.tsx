import React from "react";
import { Link } from "react-router-dom";
import "./NotFound.css";

const NotFound = () => {
  const catStyle = {
    width: "150px",
    height: "150px",
  };

  return (
    <div className="content-wrapper-404">
      <h1>404 - Page Not Found!</h1>
      <div>
        <img id="catto" style={catStyle} src="/resources/cat.jpg" alt="Catto" />
      </div>
      <Link to="/home">
        <button type="button" className="btn btn-outline-light">
          Home Page
        </button>
      </Link>
    </div>
  );
};

export default NotFound;
