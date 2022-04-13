import React from "react";
import useAuth from "../hooks/useAuth";
import Header from "../components/Header";
import {Accordion, AccordionDetails, AccordionSummary, Grid} from "@material-ui/core";
import {ExpandMoreOutlined} from "@material-ui/icons";
import Typography from "@material-ui/core/Typography";
import particlesOptions from "../particles.json";
import Particles from "react-tsparticles";

export default function Warehouse() {
    const {token} = useAuth();
    return (
        <>
            <Particles options={particlesOptions}/>
            <Grid container spacing={2}>
                <Grid item xs={12}>
                    <Header/>
                </Grid>
                <Grid item>
                    <Accordion>
                        <AccordionSummary
                            expandIcon={<ExpandMoreOutlined/>}
                            aria-controls="panel1a-content"
                            id="panel1a-header"
                        >
                            <Typography>Train 1</Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Typography>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                                malesuada lacus ex, sit amet blandit leo lobortis eget.
                            </Typography>
                        </AccordionDetails>
                    </Accordion>
                </Grid>
                <Grid item>
                    <Accordion>
                        <AccordionSummary
                            expandIcon={<ExpandMoreOutlined/>}
                            aria-controls="panel1a-content"
                            id="panel1a-header"
                        >
                            <Typography>Train 1</Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Typography>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                                malesuada lacus ex, sit amet blandit leo lobortis eget.
                            </Typography>
                        </AccordionDetails>
                    </Accordion>
                </Grid>
                <Grid item>
                    <Accordion>
                        <AccordionSummary
                            expandIcon={<ExpandMoreOutlined/>}
                            aria-controls="panel1a-content"
                            id="panel1a-header"
                        >
                            <Typography>Train 1</Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Typography>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                                malesuada lacus ex, sit amet blandit leo lobortis eget.
                            </Typography>
                        </AccordionDetails>
                    </Accordion>
                </Grid>
                <Grid item>
                    <Accordion>
                        <AccordionSummary
                            expandIcon={<ExpandMoreOutlined/>}
                            aria-controls="panel1a-content"
                            id="panel1a-header"
                        >
                            <Typography>Train 1</Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Typography>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                                malesuada lacus ex, sit amet blandit leo lobortis eget.
                            </Typography>
                        </AccordionDetails>
                    </Accordion>
                </Grid>
                <Grid item>
                    <Accordion>
                        <AccordionSummary
                            expandIcon={<ExpandMoreOutlined/>}
                            aria-controls="panel1a-content"
                            id="panel1a-header"
                        >
                            <Typography>Train 1</Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Typography>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                                malesuada lacus ex, sit amet blandit leo lobortis eget.
                            </Typography>
                        </AccordionDetails>
                    </Accordion>
                </Grid>
            </Grid>
        </>
    )
}