import React from 'react';
import AppBar from '@material-ui/core/AppBar';
import Button from '@material-ui/core/Button';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import {withStyles} from '@material-ui/core/styles';
import useAuth from "../hooks/useAuth";
import {NavLink} from "react-router-dom";

const styles = theme => ({
    '@global': {
        body: {
            backgroundColor: theme.palette.common.white,
        },
    },
    appBar: {
        position: 'relative',
    },
    toolbarTitle: {
        flex: 1,
    },
    layout: {
        width: 'auto',
        marginLeft: theme.spacing.unit * 3,
        marginRight: theme.spacing.unit * 3,
        [theme.breakpoints.up(900 + theme.spacing.unit * 3 * 2)]: {
            width: 900,
            marginLeft: 'auto',
            marginRight: 'auto',
        },
    },
    heroContent: {
        maxWidth: 600,
        margin: '0 auto',
        padding: `${theme.spacing.unit * 8}px 0 ${theme.spacing.unit * 6}px`,
    },
    cardHeader: {
        backgroundColor: theme.palette.grey[200],
    },
    cardPricing: {
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'baseline',
        marginBottom: theme.spacing.unit * 2,
    },
    cardActions: {
        [theme.breakpoints.up('sm')]: {
            paddingBottom: theme.spacing.unit * 2,
        },
    },
    footer: {
        marginTop: theme.spacing.unit * 8,
        borderTop: `1px solid ${theme.palette.divider}`,
        padding: `${theme.spacing.unit * 6}px 0`,
    },
    link: {
        textDecoration: 'none'
    }
});

function Header(props) {
    const {classes} = props;
    const {token, onLogout, onLogin} = useAuth();

    return (
        <AppBar position="static" color="default" className={classes.appBar}>
            <Toolbar>
                <Typography variant="h6" color="inherit" noWrap className={classes.toolbarTitle}>
                    Company name
                </Typography>
                <NavLink to="/admin" className={classes.link}><Button>Admin</Button></NavLink>
                <NavLink to="/logistic" className={classes.link}><Button>Logistic</Button></NavLink>
                <NavLink to="/warehouse" className={classes.link}><Button>Warehouse</Button></NavLink>
                <NavLink to="/station" className={classes.link}><Button>Stations</Button></NavLink>
                <Button color="primary" variant="outlined" onClick={onLogout}>
                    Logout
                </Button>
            </Toolbar>
        </AppBar>
    );
}

export default  withStyles(styles)(Header);