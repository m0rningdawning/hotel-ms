import React from "react";
import { useLocation } from "react-router-dom";
import "./HmsFooter.css";

const HmsFooter = () => {
  const linkList = [
    { to: "/home", text: "Home Page" },
    { to: "/admin", text: "Admin Page" },
    { to: "*", text: "404 Page" },
    { to: "/login", text: "Login Page" },
  ];

  const footerTypes = ["footer", "footer-login"];

  const location = useLocation();
  // const [scrollTransition, setScrollTransition] = useState(false);

  // useEffect(() => {
  //   const handleScroll = () => {
  //     if (window.scrollY > 0) {
  //       setScrollTransition(true);
  //     } else {
  //       setScrollTransition(false);
  //     }
  //   };

  //   window.addEventListener("scroll", handleScroll);

  //   return () => {
  //     window.removeEventListener("scroll", handleScroll);
  //   };
  // }, []);

  return (
    <>
      <footer
        className={
          location.pathname === linkList[3].to ? footerTypes[1] : footerTypes[0]
        }
      >
        <div className="text-center p-3">
          &copy; {new Date().getFullYear()} Copyright:{" "}
          <a
            className="text-light"
            href="https://github.com/m0rningdawning/hotel-ms"
          >
            Hotel Management System
          </a>
        </div>
      </footer>
    </>
  );
};

export default HmsFooter;
