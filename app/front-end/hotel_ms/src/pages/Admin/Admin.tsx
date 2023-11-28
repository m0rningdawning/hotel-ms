import React from "react";
import HmsFooter from "../../components/footer/HmsFooter";
import HmsHeader from "../../components/header/HmsHeader";
import HomeCarousel from "../../components/home-carousel/HomeCarousel";
import "./Admin.css";

const Admin = () => {
  return (
    <>
      <HmsHeader />
      <div>
        <img id="raccoon" src="/resources/raccoon.jpeg" alt="Raccoon" />
      </div>
      <div className="content-wrapper-admin">
        <div className="content-aside">
          <center>
            <h1 className="content-h1">Rooms</h1>
          </center>
          <p id="p-content">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugit ipsum
            quo consectetur nulla unde, ea amet cumque voluptatem, nam quam
            libero alias impedit similique, autem sapiente delectus nisi
            quisquam doloremque? Nihil possimus temporibus veniam sequi, aliquam
            quia error soluta eius libero suscipit iure veritatis tenetur sit
            adipisci, sapiente repellendus dolore, reiciendis fugit. Mollitia,
            vitae sit. Omnis, ipsa. Molestiae quasi ea doloremque voluptatum
            aliquid aliquam labore facere, consectetur natus animi error nobis
            hic, quas quis, tenetur voluptatem reprehenderit optio ducimus.
            Corporis inventore dicta nihil perferendis at ex. Maxime molestiae
            numquam temporibus labore vel quam veritatis iste repudiandae eius
            illum ad dignissimos, modi quo rerum aliquid nulla consequuntur
            laboriosam quaerat facere facilis. Incidunt commodi numquam, eveniet
            corrupti accusamus praesentium officiis dolore, magni nostrum ipsum
            dolorum libero delectus amet sapiente repellat ipsam ea. Voluptates
            eaque eius ipsa inventore magni repudiandae, temporibus, quaerat at
            voluptatum illum porro alias cupiditate quisquam excepturi cum
            labore quae.
          </p>
          <HomeCarousel />
        </div>
        <div className="content-aside">
          <p id="p-content">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugit ipsum
            quo consectetur nulla unde, ea amet cumque voluptatem, nam quam
            libero alias impedit similique, autem sapiente delectus nisi
            quisquam doloremque? Nihil possimus temporibus veniam sequi, aliquam
            quia error soluta eius libero suscipit iure veritatis tenetur sit
            adipisci, sapiente repellendus dolore, reiciendis fugit. Mollitia,
            vitae sit. Omnis, ipsa. Molestiae quasi ea doloremque voluptatum
            aliquid aliquam labore facere, consectetur natus animi error nobis
            hic, quas quis, tenetur voluptatem reprehenderit optio ducimus.
            Corporis inventore dicta nihil perferendis at ex. Maxime molestiae
            numquam temporibus labore vel quam veritatis iste repudiandae eius
            illum ad dignissimos, modi quo rerum aliquid nulla consequuntur
            laboriosam quaerat facere facilis. Incidunt commodi numquam, eveniet
            corrupti accusamus praesentium officiis dolore, magni nostrum ipsum
            dolorum libero delectus amet sapiente repellat ipsam ea. Voluptates
            eaque eius ipsa inventore magni repudiandae, temporibus, quaerat at
            voluptatum illum porro alias cupiditate quisquam excepturi cum
            labore quae. Harum veritatis quidem fugit quibusdam nihil sed
            aliquam maxime tempora ipsam accusamus possimus fugiat fuga nisi,
            molestias nemo eligendi odit porro. Possimus nostrum sapiente quasi
            libero rerum ipsam vel nemo repellendus, placeat soluta aut harum
            doloremque recusandae, commodi architecto in consequuntur
            consectetur consequatur veritatis nulla? Explicabo aliquid deleniti
            quod, molestiae veritatis perferendis modi, porro provident maxime
            facere sint sit voluptatibus sunt. Dolorum corrupti, distinctio
            voluptatum tempore incidunt consequuntur quae quidem quaerat dolorem
            fugiat nemo. Consequatur, suscipit minima voluptate dicta amet
            exercitationem, ut eveniet consectetur in ipsum maiores? Cumque illo
            cupiditate est beatae nulla nam dignissimos quos nisi voluptatem
            ullam accusamus, necessitatibus molestias, ipsa sunt placeat?
            Recusandae commodi nobis maiores sapiente, itaque sequi dolor
            perspiciatis similique velit officia asperiores reprehenderit in
            consequatur ipsa culpa laudantium? Fugit, iusto autem corrupti
            laudantium pariatur, saepe reprehenderit enim in nulla voluptatibus
            nostrum dolores recusandae. Quibusdam magnam amet reprehenderit
            possimus quia voluptatibus libero dolor quis qui ducimus quisquam
            deserunt beatae itaque, veniam voluptates, nostrum quam velit vitae
            eius maiores, nobis dicta quasi ad? Voluptatibus itaque earum
            aspernatur minima, sit mollitia maiores velit excepturi illo,
            voluptatem nobis quaerat. Autem ducimus minima vitae temporibus
            recusandae voluptate quaerat, nostrum, nesciunt quia adipisci fuga a
            harum consectetur similique odio est officia consequuntur! Obcaecati
            laudantium blanditiis commodi iusto repudiandae saepe cum
            consectetur ipsa, placeat laborum possimus eveniet ad, quis tempore
          </p>
        </div>
      </div>
      <HmsFooter />
    </>
  );
};

export default Admin;
