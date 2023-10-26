import React from "react";
import { Link } from "react-router-dom";

const NotFound = () => {
  const catStyle = {
    width: "150px",
    height: "150px",
  };

  return (
    <div>
      <h1>404 - Page Not Found!</h1>
      <div>
        <img
          id="raccoon"
          style={catStyle}
          src="/resources/cat.jpg"
          alt="Raccoon"
        />
      </div>
      <Link to="/home">Go to Home Page</Link>
    </div>
  );
};

export default NotFound;
